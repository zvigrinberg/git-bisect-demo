# git bisect command Demo
## Goal - to demonstrate how to quickly find a problematic commit that introduced a bug in quite big commits tree.

In order to show it, I'll use a simple spring boot application..
## Procedure
1. Start the bisect on main branch
```shell
 [zgrinber@zgrinber git-bisect-demo]$ git bisect start
```
2. Define a bad commit(current commit pointed by main branch and HEAD)
```shell
 [zgrinber@zgrinber git-bisect-demo]$  git bisect bad
```
3. Define a good commit(pointed by first version denoted by tag V1.0) that the application worked and tests were passed successfully
```shell
 [zgrinber@zgrinber git-bisect-demo]$  git bisect good V1.0
 Bisecting: 396 revisions left to test after this (roughly 9 steps)
[c11e9e4086a6bb4e83241463c498320001df2ce6] add new phonetic mapping 403
```
4. test the current checkouted commit:
```shell
 [zgrinber@zgrinber git-bisect-demo]$ mvn clean test
 2022-07-31 12:27:41.158  INFO 88241 --- [           main] t.c.s.AnnotationConfigContextLoaderUtils : Could not detect default configuration classes for test class [controller.MyControllerTest]: MyControllerTest does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 0.017 s <<< FAILURE! - in controller.MyControllerTest
[ERROR] controller.MyControllerTest  Time elapsed: 0.016 s  <<< ERROR!
java.lang.IllegalStateException: Unable to find a @SpringBootConfiguration, you need to use @ContextConfiguration or @SpringBootTest(classes=...) with your test

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   MyControllerTest » IllegalState Unable to find a @SpringBootConfiguration, you...
[INFO] 
[ERROR] Tests run: 2, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.323 s
[INFO] Finished at: 2022-07-31T12:27:41+03:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.22.2:test (default-test) on project test-demo: There are test failures.
[ERROR] 
[ERROR] Please refer to /home/zgrinber/git/git-bisect-demo/target/surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
```
5. We failed on the test, then we'll tell git bisect that this is also a bad commit
```shell
[zgrinber@zgrinber git-bisect-demo]$ git bisect bad
Bisecting: 198 revisions left to test after this (roughly 8 steps)
[fe446c4b3295c095886aa71d3c9fa1141e2b5975] add new phonetic mapping 205
```
6. Let's test the current commit that git bisect checked out:
```shell
[zgrinber@zgrinber git-bisect-demo]$ mvn clean test

[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.411 s - in com.redhat.zvikag.testdemo.controller.MyControllerTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.692 s
[INFO] Finished at: 2022-07-31T12:32:30+03:00
[INFO] ------------------------------------------------------------------------

```
7.Tested of the current commit succeeded, then we'll tell git bisect that this commit is good
```shell
[zgrinber@zgrinber git-bisect-demo]$ git bisect good
Bisecting: 99 revisions left to test after this (roughly 7 steps)
[72626011b1a64ae0e3e52ea25b0ec4915dad2994] add new phonetic mapping 304

```

8.We already narrowed down the range of commits to tests to 99 instead of 793 commits. \
  We will continue in the same way, by testing each checkout out commit, and tell git bisect if it's a good or bad commit.
  in this case, we'll get a series of good commits, until we'll find the problematic commit that broke the code
  ```shell
    [zgrinber@zgrinber git-bisect-demo]$ mvn clean test 
    [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.421 s - in com.redhat.zvikag.testdemo.controller.MyControllerTest
    [INFO] 
    [INFO] Results:
    [INFO] 
    [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
    [INFO] 
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  4.668 s
    [INFO] Finished at: 2022-07-31T12:37:19+03:00
    [INFO] ------------------------------------------------------------------------
    [zgrinber@zgrinber git-bisect-demo]$ git bisect good
    Bisecting: 49 revisions left to test after this (roughly 6 steps)
    [05c1929fc1eabd2151262032ddc15d33288efdd0] add new phonetic mapping 354
    [zgrinber@zgrinber git-bisect-demo]$ mvn clean test 
    [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.421 s - in com.redhat.zvikag.testdemo.controller.MyControllerTest
    [INFO] 
    [INFO] Results:
    [INFO] 
    [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
    [INFO] 
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  4.668 s
    [INFO] Finished at: 2022-07-31T12:37:19+03:00
    [INFO] ------------------------------------------------------------------------
    [zgrinber@zgrinber git-bisect-demo]$ 
    [zgrinber@zgrinber git-bisect-demo]$ git bisect good
    Bisecting: 24 revisions left to test after this (roughly 5 steps)
    [7fab4ede68b80d338bcec58674aa4a3252f28dbd] add new phonetic mapping 379
    [zgrinber@zgrinber git-bisect-demo]$
    [zgrinber@zgrinber git-bisect-demo]$ mvn clean test 
    [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.421 s - in com.redhat.zvikag.testdemo.controller.MyControllerTest
    [INFO] 
    [INFO] Results:
    [INFO] 
    [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
    [INFO] 
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  4.668 s
    [INFO] Finished at: 2022-07-31T12:37:19+03:00
    [INFO] ------------------------------------------------------------------------
    [zgrinber@zgrinber git-bisect-demo]$ 
    [zgrinber@zgrinber git-bisect-demo]$ git bisect good
    Bisecting: 12 revisions left to test after this (roughly 4 steps)
    [7e52dec81ff48d8eadbeb99c1fb7714f163d0c74] add new phonetic mapping 391
    [zgrinber@zgrinber git-bisect-demo]$ mvn clean test 
    [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.421 s - in com.redhat.zvikag.testdemo.controller.MyControllerTest
    [INFO] 
    [INFO] Results:
    [INFO] 
    [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
    [INFO] 
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  4.668 s
    [INFO] Finished at: 2022-07-31T12:37:19+03:00
    [INFO] ------------------------------------------------------------------------
    [zgrinber@zgrinber git-bisect-demo]$ 
    [zgrinber@zgrinber git-bisect-demo]$ git bisect good
    Bisecting: 6 revisions left to test after this (roughly 3 steps)
    [4d44ad8a5825d7da3564bf8bed9e112bf96ba1e8] add new phonetic mapping 397
    [zgrinber@zgrinber git-bisect-demo]$ 
    [zgrinber@zgrinber git-bisect-demo]$ mvn clean test 
    [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.421 s - in com.redhat.zvikag.testdemo.controller.MyControllerTest
    [INFO] 
    [INFO] Results:
    [INFO] 
    [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
    [INFO] 
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  4.668 s
    [INFO] Finished at: 2022-07-31T12:37:19+03:00
    [INFO] ------------------------------------------------------------------------
    [zgrinber@zgrinber git-bisect-demo]$ 
    [zgrinber@zgrinber git-bisect-demo]$ git bisect good
    Bisecting: 3 revisions left to test after this (roughly 2 steps)
    [43b3ff204bebcbe8f5be1a5ec7546574d780da74] add new phonetic mapping 400
    [zgrinber@zgrinber git-bisect-demo]$ 
    [zgrinber@zgrinber git-bisect-demo]$ mvn clean test 
    [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.421 s - in com.redhat.zvikag.testdemo.controller.MyControllerTest
    [INFO] 
    [INFO] Results:
    [INFO] 
    [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
    [INFO] 
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  4.668 s
    [INFO] Finished at: 2022-07-31T12:37:19+03:00
    [INFO] ------------------------------------------------------------------------
    [zgrinber@zgrinber git-bisect-demo]$ 
    [zgrinber@zgrinber git-bisect-demo]$ git bisect good
    Bisecting: 1 revision left to test after this (roughly 1 step)
    [869e2cc5194ad13141c1742011e883ca3996cdc2] add new phonetic mapping 401
    [zgrinber@zgrinber git-bisect-demo]$ 
    [zgrinber@zgrinber git-bisect-demo]$ mvn clean test
    [ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 0.015 s <<< FAILURE! - in controller.MyControllerTest
    [ERROR] controller.MyControllerTest  Time elapsed: 0.015 s  <<< ERROR!
    java.lang.IllegalStateException: Unable to find a @SpringBootConfiguration, you need to use @ContextConfiguration or @SpringBootTest(classes=...) 
     with your test

    [INFO] 
    [INFO] Results:
    [INFO] 
    [ERROR] Errors: 
    [ERROR]   MyControllerTest » IllegalState Unable to find a @SpringBootConfiguration, you...
    [INFO] 
    [ERROR] Tests run: 2, Failures: 0, Errors: 1, Skipped: 0
    [INFO] 
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD FAILURE
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  4.224 s
    [INFO] Finished at: 2022-07-31T13:49:45+03:00
    [INFO] ------------------------------------------------------------------------
    [ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.22.2:test (default-test) on project test-demo: There are test  
    failures.

9. The last checkout commit failed, so we're marking it as bad
```shell
[zgrinber@zgrinber git-bisect-demo]$ git bisect bad 
Bisecting: 0 revisions left to test after this (roughly 0 steps)
[6d2e3d8f42180aeadc9bfc87670862492bd8cb91] problematic commit that breaks the code
```
And we got the problematic commit

10. now current checked out commit is the problematic one, so tag it with a name
```shell
[zgrinber@zgrinber git-bisect-demo]$ git tag problematicVersion
```

11. show the full log of the bisect:
```shell
[zgrinber@zgrinber git-bisect-demo]$ git bisect log
git bisect start
# bad: [dee7d4814ac87b2e8a7285b0ba4d30e0d3ca95ae] add new phonetic mapping 800
git bisect bad dee7d4814ac87b2e8a7285b0ba4d30e0d3ca95ae
# good: [1fb23c8a088f2429f152e472dfa7ca9e0961e429] first working revision
git bisect good 1fb23c8a088f2429f152e472dfa7ca9e0961e429
# bad: [c11e9e4086a6bb4e83241463c498320001df2ce6] add new phonetic mapping 403
git bisect bad c11e9e4086a6bb4e83241463c498320001df2ce6
# good: [fe446c4b3295c095886aa71d3c9fa1141e2b5975] add new phonetic mapping 205
git bisect good fe446c4b3295c095886aa71d3c9fa1141e2b5975
# good: [72626011b1a64ae0e3e52ea25b0ec4915dad2994] add new phonetic mapping 304
git bisect good 72626011b1a64ae0e3e52ea25b0ec4915dad2994
# good: [05c1929fc1eabd2151262032ddc15d33288efdd0] add new phonetic mapping 354
git bisect good 05c1929fc1eabd2151262032ddc15d33288efdd0
# good: [7fab4ede68b80d338bcec58674aa4a3252f28dbd] add new phonetic mapping 379
git bisect good 7fab4ede68b80d338bcec58674aa4a3252f28dbd
# good: [7e52dec81ff48d8eadbeb99c1fb7714f163d0c74] add new phonetic mapping 391
git bisect good 7e52dec81ff48d8eadbeb99c1fb7714f163d0c74
# good: [4d44ad8a5825d7da3564bf8bed9e112bf96ba1e8] add new phonetic mapping 397
git bisect good 4d44ad8a5825d7da3564bf8bed9e112bf96ba1e8
# good: [43b3ff204bebcbe8f5be1a5ec7546574d780da74] add new phonetic mapping 400
git bisect good 43b3ff204bebcbe8f5be1a5ec7546574d780da74
# bad: [869e2cc5194ad13141c1742011e883ca3996cdc2] add new phonetic mapping 401
git bisect bad 869e2cc5194ad13141c1742011e883ca3996cdc2
[zgrinber@zgrinber git-bisect-demo]$ 

```
Note: After checking only 10 commits,out of almost 800 commits, we identified the problematic commit!.

12. end the bisect process by the following command
```shell
[zgrinber@zgrinber git-bisect-demo]$ git bisect reset 
Previous HEAD position was 6d2e3d8 problematic commit that breaks the code
Switched to branch 'main'
```

13. Now create new branch fixBug:
```shell
[zgrinber@zgrinber git-bisect-demo]$ git checkout -b fixBug
Switched to a new branch 'fixBug'
```
14. We're about toe revert the problematic commit, Just verify that the code is broken before reverting the commit
```shell
[zgrinber@zgrinber git-bisect-demo]$ mvn clean test
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 0.01 s <<< FAILURE! - in controller.MyControllerTest
[ERROR] controller.MyControllerTest  Time elapsed: 0.01 s  <<< ERROR!
java.lang.IllegalStateException: Unable to find a @SpringBootConfiguration, you need to use @ContextConfiguration or @SpringBootTest(classes=...) with your test

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   MyControllerTest » IllegalState Unable to find a @SpringBootConfiguration, you...
[INFO] 
[ERROR] Tests run: 2, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.333 s
[INFO] Finished at: 2022-07-31T14:03:01+03:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.22.2:test (default-test) on project test-demo: There are test failures.
```
15. Revert the problematic commit using git revert command and :
```shell
[zgrinber@zgrinber git-bisect-demo]$ git revert problematicVersion 
```
You'll see an editor screen, just save it or quit it, and a new commit that reverting the problematic one will be created.

16. Verify that the issue was fixed
```shell
[zgrinber@zgrinber git-bisect-demo]$ mvn clean test
2022-07-31 14:06:57.708  INFO 104535 --- [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 0 ms
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.553 s - in com.redhat.zvikag.testdemo.controller.MyControllerTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.809 s
[INFO] Finished at: 2022-07-31T14:06:58+03:00
[INFO] ------------------------------------------------------------------------
[zgrinber@zgrinber git-bisect-demo]$ 
```
17. Now push to remote upstream and open PR from fixBug to main on github, or on local git repo, merge fixBug into main and push to remote
```shell
[zgrinber@zgrinber git-bisect-demo]$ git checkout main ; git merge fixBug --ff-only ; git push
```

