package data;


import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
@Data
public class Datasource {

    private Map<Integer,String> phonetics;

    @PostConstruct
    void populatePhonetics()
    {
        populatePhoneticsImpl();


    }

    public Datasource() {
         populatePhoneticsImpl();

    }

    private void populatePhoneticsImpl() {
        phonetics = new HashMap<>();
        phonetics.put(1,"One");
        phonetics.put(2,"Two");
        phonetics.put(3,"Three");
        phonetics.put(4,"Four");
        phonetics.put(5,"Five");
        phonetics.put(6,"Six");
        phonetics.put(7,"Seven");
        phonetics.put(8,"Eight");
        phonetics.put(9,"Nine");
        phonetics.put(10,"Ten");
        phonetics.put(11,"Eleven");
        phonetics.put(12,"12");
        phonetics.put(13,"13");
        phonetics.put(14,"14");
        phonetics.put(15,"15");
        phonetics.put(16,"16");
        phonetics.put(17,"17");
        phonetics.put(18,"18");
        phonetics.put(19,"19");
        phonetics.put(20,"20");
        phonetics.put(21,"21");
        phonetics.put(22,"22");
        phonetics.put(23,"23");
        phonetics.put(24,"24");
        phonetics.put(25,"25");
        phonetics.put(26,"26");
        phonetics.put(27,"27");
        phonetics.put(28,"28");
        phonetics.put(29,"29");
        phonetics.put(30,"30");
        phonetics.put(31,"31");
        phonetics.put(32,"32");
        phonetics.put(33,"33");
        phonetics.put(34,"34");
        phonetics.put(35,"35");
        phonetics.put(36,"36");
        phonetics.put(37,"37");
        phonetics.put(38,"38");
        phonetics.put(39,"39");
        phonetics.put(40,"40");
        phonetics.put(41,"41");
        phonetics.put(42,"42");
        phonetics.put(43,"43");
        phonetics.put(44,"44");
        phonetics.put(45,"45");
        phonetics.put(46,"46");
        phonetics.put(47,"47");
        phonetics.put(48,"48");
        phonetics.put(49,"49");
        phonetics.put(50,"50");
        phonetics.put(51,"51");
        phonetics.put(52,"52");
        phonetics.put(53,"53");
        phonetics.put(54,"54");
        phonetics.put(55,"55");
        phonetics.put(56,"56");
        phonetics.put(57,"57");
        phonetics.put(58,"58");
        phonetics.put(59,"59");
        phonetics.put(60,"60");
        phonetics.put(61,"61");
        phonetics.put(62,"62");
        phonetics.put(63,"63");
        phonetics.put(64,"64");
        phonetics.put(65,"65");
        phonetics.put(66,"66");
        phonetics.put(67,"67");
        phonetics.put(68,"68");
        phonetics.put(69,"69");
        phonetics.put(70,"70");
        phonetics.put(71,"71");
        phonetics.put(72,"72");
        phonetics.put(73,"73");
        phonetics.put(74,"74");
        phonetics.put(75,"75");
        phonetics.put(76,"76");
        phonetics.put(77,"77");
        phonetics.put(78,"78");
        phonetics.put(79,"79");
        phonetics.put(80,"80");
        phonetics.put(81,"81");
        phonetics.put(82,"82");
        phonetics.put(83,"83");
        phonetics.put(84,"84");
        phonetics.put(85,"85");
        phonetics.put(86,"86");
        phonetics.put(87,"87");
        phonetics.put(88,"88");
        phonetics.put(89,"89");
        phonetics.put(90,"90");
        phonetics.put(91,"91");
        phonetics.put(92,"92");
        phonetics.put(93,"93");
        phonetics.put(94,"94");
        phonetics.put(95,"95");
        phonetics.put(96,"96");
        phonetics.put(97,"97");
        phonetics.put(98,"98");
        phonetics.put(99,"99");
        phonetics.put(100,"100");
        phonetics.put(101,"101");
        phonetics.put(102,"102");
        phonetics.put(103,"103");
        phonetics.put(104,"104");
        phonetics.put(105,"105");
        phonetics.put(106,"106");
        phonetics.put(107,"107");
        phonetics.put(108,"108");
        phonetics.put(109,"109");
        phonetics.put(110,"110");
        phonetics.put(111,"111");
        phonetics.put(112,"112");
        phonetics.put(113,"113");
        phonetics.put(114,"114");
        phonetics.put(115,"115");
        phonetics.put(116,"116");
        phonetics.put(117,"117");
        phonetics.put(118,"118");
        phonetics.put(119,"119");
        phonetics.put(120,"120");
        phonetics.put(121,"121");
        phonetics.put(122,"122");
        phonetics.put(123,"123");
        phonetics.put(124,"124");
        phonetics.put(125,"125");
        phonetics.put(126,"126");
        phonetics.put(127,"127");
        phonetics.put(128,"128");
        phonetics.put(129,"129");
        phonetics.put(130,"130");
        phonetics.put(131,"131");
        phonetics.put(132,"132");
        phonetics.put(133,"133");
        phonetics.put(134,"134");
        phonetics.put(135,"135");
        phonetics.put(136,"136");
        phonetics.put(137,"137");
        phonetics.put(138,"138");
        phonetics.put(139,"139");
        phonetics.put(140,"140");
        phonetics.put(141,"141");
        phonetics.put(142,"142");
        phonetics.put(143,"143");
        phonetics.put(144,"144");
        phonetics.put(145,"145");
        phonetics.put(146,"146");
        phonetics.put(147,"147");
        phonetics.put(148,"148");
        phonetics.put(149,"149");
        phonetics.put(150,"150");
        phonetics.put(151,"151");
        phonetics.put(152,"152");
        phonetics.put(153,"153");
        phonetics.put(154,"154");
        phonetics.put(155,"155");
        phonetics.put(156,"156");
        phonetics.put(157,"157");
        phonetics.put(158,"158");
        phonetics.put(159,"159");
        phonetics.put(160,"160");
        phonetics.put(161,"161");
        phonetics.put(162,"162");
        phonetics.put(163,"163");
        phonetics.put(164,"164");
        phonetics.put(165,"165");
        phonetics.put(166,"166");
        phonetics.put(167,"167");
        phonetics.put(168,"168");
        phonetics.put(169,"169");
        phonetics.put(170,"170");
        phonetics.put(171,"171");
        phonetics.put(172,"172");
        phonetics.put(173,"173");
        phonetics.put(174,"174");
        phonetics.put(175,"175");
        phonetics.put(176,"176");
        phonetics.put(177,"177");
        phonetics.put(178,"178");
        phonetics.put(179,"179");
        phonetics.put(180,"180");
        phonetics.put(181,"181");
        phonetics.put(182,"182");
        phonetics.put(183,"183");
        phonetics.put(184,"184");
        phonetics.put(185,"185");
        phonetics.put(186,"186");
        phonetics.put(187,"187");
        phonetics.put(188,"188");
        phonetics.put(189,"189");
        phonetics.put(190,"190");
        phonetics.put(191,"191");
        phonetics.put(192,"192");
        phonetics.put(193,"193");
        phonetics.put(194,"194");
        phonetics.put(195,"195");
        phonetics.put(196,"196");
        phonetics.put(197,"197");
        phonetics.put(198,"198");
        phonetics.put(199,"199");
        phonetics.put(200,"200");
        phonetics.put(201,"201");
        phonetics.put(202,"202");
        phonetics.put(203,"203");
        phonetics.put(204,"204");
        phonetics.put(205,"205");
        phonetics.put(206,"206");
        phonetics.put(207,"207");
        phonetics.put(208,"208");
        phonetics.put(209,"209");
        phonetics.put(210,"210");
        phonetics.put(211,"211");
        phonetics.put(212,"212");
        phonetics.put(213,"213");
        phonetics.put(214,"214");
        phonetics.put(215,"215");
        phonetics.put(216,"216");
        phonetics.put(217,"217");
        phonetics.put(218,"218");
        phonetics.put(219,"219");
        phonetics.put(220,"220");
        phonetics.put(221,"221");
        phonetics.put(222,"222");
        phonetics.put(223,"223");
        phonetics.put(224,"224");
        phonetics.put(225,"225");
        phonetics.put(226,"226");
        phonetics.put(227,"227");
        phonetics.put(228,"228");
        phonetics.put(229,"229");
        phonetics.put(230,"230");
        phonetics.put(231,"231");
        phonetics.put(232,"232");
        phonetics.put(233,"233");
        phonetics.put(234,"234");
        phonetics.put(235,"235");
        phonetics.put(236,"236");
        phonetics.put(237,"237");
        phonetics.put(238,"238");
        phonetics.put(239,"239");
        phonetics.put(240,"240");
        phonetics.put(241,"241");
        phonetics.put(242,"242");
        phonetics.put(243,"243");
        phonetics.put(244,"244");
        phonetics.put(245,"245");
        phonetics.put(246,"246");
        phonetics.put(247,"247");
        phonetics.put(248,"248");
        phonetics.put(249,"249");
        phonetics.put(250,"250");
        phonetics.put(251,"251");
        phonetics.put(252,"252");
        phonetics.put(253,"253");
        phonetics.put(254,"254");
        phonetics.put(255,"255");
        phonetics.put(256,"256");
        phonetics.put(257,"257");
        phonetics.put(258,"258");
        phonetics.put(259,"259");
        phonetics.put(260,"260");
        phonetics.put(261,"261");
        phonetics.put(262,"262");
        phonetics.put(263,"263");
        phonetics.put(264,"264");
        phonetics.put(265,"265");
        phonetics.put(266,"266");
        phonetics.put(267,"267");
        phonetics.put(268,"268");
        phonetics.put(269,"269");
        phonetics.put(270,"270");
        phonetics.put(271,"271");
        phonetics.put(272,"272");
        phonetics.put(273,"273");
        phonetics.put(274,"274");
        phonetics.put(275,"275");
        phonetics.put(276,"276");
        phonetics.put(277,"277");
        phonetics.put(278,"278");
        phonetics.put(279,"279");
        phonetics.put(280,"280");
        phonetics.put(281,"281");
        phonetics.put(282,"282");
        phonetics.put(283,"283");
        phonetics.put(284,"284");
        phonetics.put(285,"285");
        phonetics.put(286,"286");
        phonetics.put(287,"287");
        phonetics.put(288,"288");
        phonetics.put(289,"289");
        phonetics.put(290,"290");
        phonetics.put(291,"291");
        phonetics.put(292,"292");
        phonetics.put(293,"293");
        phonetics.put(294,"294");
        phonetics.put(295,"295");
        phonetics.put(296,"296");
        phonetics.put(297,"297");
        phonetics.put(298,"298");
        phonetics.put(299,"299");
        phonetics.put(300,"300");
        phonetics.put(301,"301");
        phonetics.put(302,"302");
        phonetics.put(303,"303");
        phonetics.put(304,"304");
        phonetics.put(305,"305");
        phonetics.put(306,"306");
        phonetics.put(307,"307");
        phonetics.put(308,"308");
        phonetics.put(309,"309");
        phonetics.put(310,"310");
        phonetics.put(311,"311");
        phonetics.put(312,"312");
        phonetics.put(313,"313");
        phonetics.put(314,"314");
        phonetics.put(315,"315");
        phonetics.put(316,"316");
        phonetics.put(317,"317");
        phonetics.put(318,"318");
        phonetics.put(319,"319");
        phonetics.put(320,"320");
        phonetics.put(321,"321");
        phonetics.put(322,"322");
        phonetics.put(323,"323");
        phonetics.put(324,"324");
        phonetics.put(325,"325");
        phonetics.put(326,"326");
        phonetics.put(327,"327");
        phonetics.put(328,"328");
        phonetics.put(329,"329");
        phonetics.put(330,"330");
        phonetics.put(331,"331");
        phonetics.put(332,"332");
        phonetics.put(333,"333");
        phonetics.put(334,"334");
        phonetics.put(335,"335");
        phonetics.put(336,"336");
        phonetics.put(337,"337");
        phonetics.put(338,"338");
        phonetics.put(339,"339");
        phonetics.put(340,"340");
        phonetics.put(341,"341");
        phonetics.put(342,"342");
        phonetics.put(343,"343");
        phonetics.put(344,"344");
        phonetics.put(345,"345");
        phonetics.put(346,"346");
        phonetics.put(347,"347");
        phonetics.put(348,"348");
        phonetics.put(349,"349");
        phonetics.put(350,"350");
        phonetics.put(351,"351");
        phonetics.put(352,"352");
        phonetics.put(353,"353");
        phonetics.put(354,"354");
        phonetics.put(355,"355");
        phonetics.put(356,"356");
        phonetics.put(357,"357");
        phonetics.put(358,"358");
        phonetics.put(359,"359");
        phonetics.put(360,"360");
        phonetics.put(361,"361");
        phonetics.put(362,"362");
        phonetics.put(363,"363");
        phonetics.put(364,"364");
        phonetics.put(365,"365");
        phonetics.put(366,"366");
        phonetics.put(367,"367");
        phonetics.put(368,"368");
        phonetics.put(369,"369");
        phonetics.put(370,"370");
        phonetics.put(371,"371");
        phonetics.put(372,"372");
        phonetics.put(373,"373");
        phonetics.put(374,"374");
        phonetics.put(375,"375");
        phonetics.put(376,"376");
        phonetics.put(377,"377");
        phonetics.put(378,"378");
        phonetics.put(379,"379");
        phonetics.put(380,"380");
        phonetics.put(381,"381");
        phonetics.put(382,"382");
        phonetics.put(383,"383");
        phonetics.put(384,"384");
        phonetics.put(385,"385");
        phonetics.put(386,"386");
        phonetics.put(387,"387");
        phonetics.put(388,"388");
        phonetics.put(389,"389");
        phonetics.put(390,"390");
        phonetics.put(391,"391");
        phonetics.put(392,"392");
        phonetics.put(393,"393");
        phonetics.put(394,"394");
        phonetics.put(395,"395");
        phonetics.put(396,"396");
        phonetics.put(397,"397");
        phonetics.put(398,"398");
        phonetics.put(399,"399");
        phonetics.put(400,"400");
        phonetics.put(401,"401");
        phonetics.put(402,"402");
        phonetics.put(403,"403");
        phonetics.put(404,"404");
        phonetics.put(405,"405");
        phonetics.put(406,"406");
        phonetics.put(407,"407");
        phonetics.put(408,"408");
        phonetics.put(409,"409");
        phonetics.put(410,"410");
        phonetics.put(411,"411");
        phonetics.put(412,"412");
        phonetics.put(413,"413");
        phonetics.put(414,"414");
        phonetics.put(415,"415");
        phonetics.put(416,"416");
        phonetics.put(417,"417");
        phonetics.put(418,"418");
        phonetics.put(419,"419");
        phonetics.put(420,"420");
        phonetics.put(421,"421");
        phonetics.put(422,"422");
        phonetics.put(423,"423");
        phonetics.put(424,"424");
        phonetics.put(425,"425");
        phonetics.put(426,"426");
        phonetics.put(427,"427");
        phonetics.put(428,"428");
        phonetics.put(429,"429");
        phonetics.put(430,"430");
        phonetics.put(431,"431");
        phonetics.put(432,"432");
        phonetics.put(433,"433");
        phonetics.put(434,"434");
        phonetics.put(435,"435");
        phonetics.put(436,"436");
        phonetics.put(437,"437");
        phonetics.put(438,"438");
        phonetics.put(439,"439");
        phonetics.put(440,"440");
        phonetics.put(441,"441");
        phonetics.put(442,"442");
        phonetics.put(443,"443");
        phonetics.put(444,"444");
        phonetics.put(445,"445");
        phonetics.put(446,"446");
        phonetics.put(447,"447");
        phonetics.put(448,"448");
        phonetics.put(449,"449");
        phonetics.put(450,"450");
        phonetics.put(451,"451");
        phonetics.put(452,"452");
        phonetics.put(453,"453");
        phonetics.put(454,"454");
        phonetics.put(455,"455");
        phonetics.put(456,"456");
        phonetics.put(457,"457");
        phonetics.put(458,"458");
        phonetics.put(459,"459");
        phonetics.put(460,"460");
        phonetics.put(461,"461");
        phonetics.put(462,"462");
        phonetics.put(463,"463");
        phonetics.put(464,"464");
        phonetics.put(465,"465");
        phonetics.put(466,"466");
        phonetics.put(467,"467");
        phonetics.put(468,"468");
        phonetics.put(469,"469");
        phonetics.put(470,"470");
        phonetics.put(471,"471");
        phonetics.put(472,"472");
        phonetics.put(473,"473");
        phonetics.put(474,"474");
        phonetics.put(475,"475");
        phonetics.put(476,"476");
        phonetics.put(477,"477");
        phonetics.put(478,"478");
        phonetics.put(479,"479");
        phonetics.put(480,"480");
        phonetics.put(481,"481");
        phonetics.put(482,"482");
        phonetics.put(483,"483");
        phonetics.put(484,"484");
        phonetics.put(485,"485");
        phonetics.put(486,"486");
        phonetics.put(487,"487");
        phonetics.put(488,"488");
        phonetics.put(489,"489");
        phonetics.put(490,"490");
        phonetics.put(491,"491");
        phonetics.put(492,"492");
        phonetics.put(493,"493");
        phonetics.put(494,"494");
        phonetics.put(495,"495");
        phonetics.put(496,"496");
        phonetics.put(497,"497");
        phonetics.put(498,"498");
        phonetics.put(499,"499");
        phonetics.put(500,"500");
        phonetics.put(501,"501");
        phonetics.put(502,"502");
        phonetics.put(503,"503");
        phonetics.put(504,"504");
        phonetics.put(505,"505");
        phonetics.put(506,"506");
        phonetics.put(507,"507");
        phonetics.put(508,"508");
        phonetics.put(509,"509");
        phonetics.put(510,"510");
        phonetics.put(511,"511");
        phonetics.put(512,"512");
        phonetics.put(513,"513");
        phonetics.put(514,"514");
        phonetics.put(515,"515");
        phonetics.put(516,"516");
        phonetics.put(517,"517");
        phonetics.put(518,"518");
        phonetics.put(519,"519");
        phonetics.put(520,"520");
        phonetics.put(521,"521");
        phonetics.put(522,"522");
        phonetics.put(523,"523");
        phonetics.put(524,"524");
        phonetics.put(525,"525");
        phonetics.put(526,"526");
        phonetics.put(527,"527");
        phonetics.put(528,"528");
        phonetics.put(529,"529");
        phonetics.put(530,"530");
        phonetics.put(531,"531");
        phonetics.put(532,"532");
        phonetics.put(533,"533");
        phonetics.put(534,"534");
        phonetics.put(535,"535");
        phonetics.put(536,"536");
        phonetics.put(537,"537");
        phonetics.put(538,"538");
        phonetics.put(539,"539");
        phonetics.put(540,"540");
        phonetics.put(541,"541");
        phonetics.put(542,"542");
        phonetics.put(543,"543");
        phonetics.put(544,"544");
        phonetics.put(545,"545");
        phonetics.put(546,"546");
        phonetics.put(547,"547");
        phonetics.put(548,"548");
        phonetics.put(549,"549");
        phonetics.put(550,"550");
        phonetics.put(551,"551");
        phonetics.put(552,"552");
        phonetics.put(553,"553");
        phonetics.put(554,"554");
        phonetics.put(555,"555");
        phonetics.put(556,"556");
        phonetics.put(557,"557");
        phonetics.put(558,"558");
        phonetics.put(559,"559");
        phonetics.put(560,"560");
        phonetics.put(561,"561");
        phonetics.put(562,"562");
        phonetics.put(563,"563");
        phonetics.put(564,"564");
        phonetics.put(565,"565");
        phonetics.put(566,"566");
        phonetics.put(567,"567");
        phonetics.put(568,"568");
        phonetics.put(569,"569");
        phonetics.put(570,"570");
        phonetics.put(571,"571");
        phonetics.put(572,"572");
        phonetics.put(573,"573");
        phonetics.put(574,"574");
        phonetics.put(575,"575");
        phonetics.put(576,"576");
        phonetics.put(577,"577");
        phonetics.put(578,"578");
        phonetics.put(579,"579");
//HERE!
    }

}



