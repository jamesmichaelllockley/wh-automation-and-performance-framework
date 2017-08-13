package performance

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class BDDScripts extends Simulation {

	val httpProtocol = http
		.baseURL("http://sports.williamhill.com/sr-admin-set-white-list-cookie.html")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.(t|o)tf""", """.*\.png"""), WhiteList())
		.acceptEncodingHeader("gzip, deflate")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.311290 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"Accept" -> "*/*",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Content-Type" -> "application/x-www-form-urlencoded",
		"Origin" -> "http://sports.williamhill.com")

	val headers_2 = Map(
		"Accept" -> "*/*",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Origin" -> "http://sports.williamhill.com")

	val headers_7 = Map(
		"Accept" -> "*/*",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6")

	val headers_8 = Map(
		"Accept" -> "application/json",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Origin" -> "http://sports.williamhill.com")

	val headers_12 = Map(
		"Accept" -> "text/html, */*; q=0.01",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Origin" -> "http://sports.williamhill.com")

	val headers_18 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6")

	val headers_28 = Map(
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Connection" -> "Upgrade",
		"Origin" -> "http://sports.williamhill.com",
		"Pragma" -> "no-cache",
		"Sec-WebSocket-Extensions" -> "permessage-deflate; client_max_window_bits",
		"Sec-WebSocket-Key" -> "nvPM+PeKqDqU1Dl17wLBXw==",
		"Sec-WebSocket-Version" -> "13",
		"Upgrade" -> "websocket")

	val headers_30 = Map(
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Connection" -> "Upgrade",
		"Origin" -> "http://sports.williamhill.com",
		"Pragma" -> "no-cache",
		"Sec-WebSocket-Extensions" -> "permessage-deflate; client_max_window_bits",
		"Sec-WebSocket-Key" -> "WpZmSypKiDwjrl6D25J2AA==",
		"Sec-WebSocket-Version" -> "13",
		"Upgrade" -> "websocket")

	val headers_53 = Map(
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Connection" -> "Upgrade",
		"Origin" -> "http://sports.williamhill.com",
		"Pragma" -> "no-cache",
		"Sec-WebSocket-Extensions" -> "permessage-deflate; client_max_window_bits",
		"Sec-WebSocket-Key" -> "xEFmTLHRrYnO5YlocfDqJw==",
		"Sec-WebSocket-Version" -> "13",
		"Upgrade" -> "websocket")

	val headers_57 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Origin" -> "http://sports.williamhill.com")

	val headers_65 = Map(
		"Accept" -> "*/*",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"Origin" -> "http://sports.williamhill.com")

	val headers_77 = Map(
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Connection" -> "Upgrade",
		"Origin" -> "http://sports.williamhill.com",
		"Pragma" -> "no-cache",
		"Sec-WebSocket-Extensions" -> "permessage-deflate; client_max_window_bits",
		"Sec-WebSocket-Key" -> "tiR4Nq6vlcFccecfs4Lb1A==",
		"Sec-WebSocket-Version" -> "13",
		"Upgrade" -> "websocket")

	val headers_81 = Map(
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Connection" -> "Upgrade",
		"Origin" -> "http://sports.williamhill.com",
		"Pragma" -> "no-cache",
		"Sec-WebSocket-Extensions" -> "permessage-deflate; client_max_window_bits",
		"Sec-WebSocket-Key" -> "2Xbl48Tt3kFj6zd8OVS/Cg==",
		"Sec-WebSocket-Version" -> "13",
		"Upgrade" -> "websocket")

	val headers_102 = Map(
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Connection" -> "Upgrade",
		"Origin" -> "http://sports.williamhill.com",
		"Pragma" -> "no-cache",
		"Sec-WebSocket-Extensions" -> "permessage-deflate; client_max_window_bits",
		"Sec-WebSocket-Key" -> "ni5FukcJhu3Vtk94ahr/Yg==",
		"Sec-WebSocket-Version" -> "13",
		"Upgrade" -> "websocket")

	val headers_107 = Map(
		"Accept" -> "*/*",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Content-Type" -> "text/plain",
		"Origin" -> "http://pushsc1.williamhill.com")

	val headers_123 = Map(
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Connection" -> "Upgrade",
		"Origin" -> "http://sports.williamhill.com",
		"Pragma" -> "no-cache",
		"Sec-WebSocket-Extensions" -> "permessage-deflate; client_max_window_bits",
		"Sec-WebSocket-Key" -> "pmIwpcECzFtgM1ZVwvqFQg==",
		"Sec-WebSocket-Version" -> "13",
		"Upgrade" -> "websocket")

	val headers_131 = Map(
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Connection" -> "Upgrade",
		"Origin" -> "http://sports.williamhill.com",
		"Pragma" -> "no-cache",
		"Sec-WebSocket-Extensions" -> "permessage-deflate; client_max_window_bits",
		"Sec-WebSocket-Key" -> "IgD7yres2ojn/kRAdtvXzA==",
		"Sec-WebSocket-Version" -> "13",
		"Upgrade" -> "websocket")

	val headers_147 = Map(
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.8,en;q=0.6",
		"Connection" -> "Upgrade",
		"Origin" -> "http://sports.williamhill.com",
		"Pragma" -> "no-cache",
		"Sec-WebSocket-Extensions" -> "permessage-deflate; client_max_window_bits",
		"Sec-WebSocket-Key" -> "BDjYWCIRWLGiBA2tcbPzGg==",
		"Sec-WebSocket-Version" -> "13",
		"Upgrade" -> "websocket")

    val uri01 = "http://connect.facebook.net/signals/config"
    val uri02 = "http://metrics.williamhill.com"
    val uri03 = "http://ib.adnxs.com"
    val uri04 = "http://dpm.demdex.net"
    val uri05 = "http://w.sports.williamhill.com"
    val uri06 = "https://scoreboards-ssl.williamhill.com:443/diffusion"
    val uri07 = "http://nexus.ensighten.com/error/e.gif"
    val uri08 = "http://ensighten.staticcache.org/migrate"
    val uri09 = "http://williamhill.tt.omtrdc.net/m2/williamhill/mbox/json"
    val uri10 = "http://r4---sn-cn3tc-ac5d.gvt1.com/edgedl/release2/fxSaHLavG-k/26.0.0.151_win64_PepperFlashPlayer.crx3"
    val uri11 = "http://trans.staticcache.org/ob/static_versioned/api/sportsbook/latest/js/minified/OB_SportBook_API_PMT.js"
    val uri12 = "http://secdn.williamhill.com/core/ob/static/cust/images/en/blank.gif"
    val uri13 = "http://sports2.staticcache.org/sportsbook/_cdn/js"
    val uri14 = "http://trk.cetrk.com"
    val uri15 = "https://cmssports.staticcache.org/assets/image"
    val uri16 = "http://redirector.gvt1.com/edgedl/release2/fxSaHLavG-k/26.0.0.151_win64_PepperFlashPlayer.crx3"
    val uri17 = "http://rewards.williamhill.com/account/status"
    val uri19 = "http://pushsc1.williamhill.com"
    val uri20 = "http://bat.bing.com/action/0"
    val uri21 = "https://whpush.williamhill.com:443/pds/diffusion"
    val uri22 = "http://fast.williamhill.demdex.net/dest5.html"
    val uri23 = "http://ctgapi.staticcache.org/castmarketprice"
    val uri24 = "http://ad.doubleclick.net/ddm/activity"
    val uri25 = "http://bam.nr-data.net/1/da94842b8e"
    val uri26 = "sports.staticcache.org"
    val uri27 = "http://c3.adalyser.com"
    val uri28 = "http://script.crazyegg.com/pages/scripts/0010/9787.js"

	val scn = scenario("BDDScripts")
		.exec(http("request_0")
			.get("/sr-admin-set-white-list-cookie.html")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri04 + "/id?d_visid_ver=2.1.0&d_fieldgroup=MC&d_rtbd=json&d_ver=2&d_verify=1&d_orgid=279422CE52785BCE0A490D4D%40AdobeOrg&d_nsid=0&ts=1502632351844")
			.headers(headers_1),
            http("request_2")
			.get("http://" + uri26 + "/sportsbook/_cdn/fonts/whIconFont/whIconFont.woff?gllpmtv")
			.headers(headers_2),
            http("request_3")
			.get(uri04 + "/id/rd?d_visid_ver=2.1.0&d_fieldgroup=MC&d_rtbd=json&d_ver=2&d_verify=1&d_orgid=279422CE52785BCE0A490D4D%40AdobeOrg&d_nsid=0&ts=1502632351844")
			.headers(headers_1),
            http("request_4")
			.get(uri22 + "?d_nsid=0")
			.headers(headers_0),
            http("request_5")
			.get(uri02 + "/id?d_visid_ver=2.1.0&d_fieldgroup=A&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&mid=30816588691769361194017323555448625501&ts=1502632352122")
			.headers(headers_1),
            http("request_6")
			.get("http://" + uri26 + "/sportsbook/_cdn/fonts/whHoxtonWebBoldFont/WHHoxtonWeb-Bold.woff2")
			.headers(headers_2),
            http("request_7")
			.get(uri08 + "/serverComponent.php?r=929.7596952963416&ClientID=154&PageID=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb")
			.headers(headers_7),
            http("request_8")
			.get(uri09 + "?mbox=Custom_Sitewide_Global_Mbox&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=&mboxPage=2e4af2a76a96491984c4bcbdf64516b5&mboxVersion=0.9.7&mboxCount=1&mboxTime=1502635952291&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=5311A00D3A0A3FBF-3653810EA995C604")
			.headers(headers_8),
            http("request_9")
			.get(uri13 + "/sportsbook.search.js?82d96506ba9d29399453a2c5ef8eb0ae")
			.headers(headers_7),
            http("request_10")
			.get(uri08 + "/code/dec41c47eda4bddc439ac05802b62f61.js?conditionId0=231464")
			.headers(headers_7),
            http("request_11")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_Manual_Mbox_Hero_Web&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=2e4af2a76a96491984c4bcbdf64516b5&mboxVersion=0.9.7&mboxCount=2&mboxTime=1502635952488&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=5311A00D3A0A3FBF-3653810EA995C604&isCustomer=no")
			.headers(headers_8),
            http("request_12")
			.get(uri05 + "/fragments/topBets/en-gb/homepage")
			.headers(headers_12),
            http("request_13")
			.get(uri11 + "?v=2")
			.headers(headers_7),
            http("request_14")
			.get(uri08 + "/code/36b671ead4581a3902a965aa2f59f053.js?conditionId0=459733")
			.headers(headers_7),
            http("request_15")
			.get(uri08 + "/code/75884a252b327f27eee50e126f42317d.js?conditionId0=363444")
			.headers(headers_7),
            http("request_16")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_3nd_Manual_Mbox_Hero_Web&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=2e4af2a76a96491984c4bcbdf64516b5&mboxVersion=0.9.7&mboxCount=3&mboxTime=1502635952602&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=5311A00D3A0A3FBF-3653810EA995C604&isCustomer=no")
			.headers(headers_8),
            http("request_17")
			.get(uri08 + "/code/304ba51d88c67b7b14d80374c147c97d.js?conditionId0=423262")
			.headers(headers_7),
            http("request_18")
			.get(uri03 + "/getuid?http%3A%2F%2Fdpm.demdex.net%2Fibs%3Adpid%3D358%26dpuuid%3D%24UID")
			.headers(headers_18),
            http("request_19")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_4nd_Manual_Mbox_Hero_Web&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=2e4af2a76a96491984c4bcbdf64516b5&mboxVersion=0.9.7&mboxCount=4&mboxTime=1502635952683&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=5311A00D3A0A3FBF-3653810EA995C604&isCustomer=no")
			.headers(headers_8),
            http("request_20")
			.get(uri03 + "/bounce?%2Fgetuid%3Fhttp%253A%252F%252Fdpm.demdex.net%252Fibs%253Adpid%253D358%2526dpuuid%253D%2524UID")
			.headers(headers_18)
			.check(status.is(401)),
            http("request_21")
			.get(uri27 + "/?source=direct&medium=none&campaign=direct&content=(not%20set)&keyword=(not%20set)&domain=sports.williamhill.com&url=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&firstVisit=1502632352722&conversionWindowStart=1502632352722&sessionStart=1502632352722&landingPage=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&userAgent=Mozilla%2F5.0%20(Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F60.0.311290%20Safari%2F537.36&device=desktop&rnd=3620439025927")
			.headers(headers_2),
            http("request_22")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_Manual_Mbox_Hero_Native&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=2e4af2a76a96491984c4bcbdf64516b5&mboxVersion=0.9.7&mboxCount=5&mboxTime=1502635952773&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=5311A00D3A0A3FBF-3653810EA995C604&isCustomer=no")
			.headers(headers_8),
            http("request_23")
			.get(uri04 + "/ibs:dpid=358&dpuuid=5990174374547660546")
			.headers(headers_18),
            http("request_24")
			.get(uri04 + "/ibs:dpid=1175&dpuuid=t9HF-7fRnfuvipqtu9zR8rXdyfyv2MmqsYkqbufg")
			.headers(headers_18),
            http("request_25")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_3nd_Manual_Mbox_Hero_Native&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=2e4af2a76a96491984c4bcbdf64516b5&mboxVersion=0.9.7&mboxCount=6&mboxTime=1502635952809&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=5311A00D3A0A3FBF-3653810EA995C604&isCustomer=no")
			.headers(headers_8),
            http("request_26")
			.get("http://" + uri26 + "/payments/payments.js?v${env.BUILD_NUMBER}")
			.headers(headers_7),
            http("request_27")
			.get("http://" + uri26 + "/betslip/js/locales/en-gb/betslip.min.js?0ce06efa59845eba7e73fd9c26a2b579")
			.headers(headers_7),
            http("request_28")
			.get(uri21 + "?v=4&ty=WB")
			.headers(headers_28)
			.check(status.is(101)),
            http("request_29")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_4nd_Manual_Mbox_Hero_Native&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=2e4af2a76a96491984c4bcbdf64516b5&mboxVersion=0.9.7&mboxCount=7&mboxTime=1502635952853&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=5311A00D3A0A3FBF-3653810EA995C604&isCustomer=no")
			.headers(headers_8),
            http("request_30")
			.get(uri06 + "?v=4&ty=WB")
			.headers(headers_30)
			.check(status.is(101)),
            http("request_31")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s26097727325511?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A33%200%20-60&d.&nsid=0&jsonv=1&.d&sdid=5311A00D3A0A3FBF-3653810EA995C604&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&server=sports.williamhill.com&events=event208&aamb=NRX38WO0n5BH8Th-nqAG_A&c1=D%3Dg&c2=D%3Dv21&c3=D%3Dv22&c4=D%3Dv23&c5=D%3Dv24&c6=D%3Dv25&c7=D%3Dv26&c8=D%3Dv27&v10=D%3Ds_vi&v12=Non-customer&v13=Non-customer&c14=D%3Dbw&v14=Not%20logged%20in&c15=1%3A52%20PM&c16=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v20=D%3Dg&v21=sports&v22=betting&c23=1%3A52%20PM%7CSunday&v23=Homepage&v24=en-gb&v25=default&v26=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&v27=Website&c28=TRAFALGAR&c43=Landscape&v60=2%3A52%20PM%7CSunday&v63=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v67=TRAFALGAR&v75=Sun%20Aug%2013%202017&v118=Standard%20Browsing&v122=Flash%20enabled&v132=suggestionsNoCookiePresent&v137=Landscape&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7),
            http("request_32")
			.get(uri24 + "/src=4897992;type=count0;cat=whcat0;u1=SB;u2=;u3=;u4=undefined.undefined;u5=sports;u6=;dc_lat=;dc_rdid=;tag_for_child_directed_treatment=;ord=1;num='%20+%20a%20+%20'?")
			.headers(headers_18),
            http("request_33")
			.get(uri01 + "/590498974372583?v=2.7.19")
			.headers(headers_7),
            http("request_34")
			.get(uri20 + "?ti=4018288&Ver=2&mid=96d2f937-5a27-66f1-8890-1a6e031ad710&evt=pageLoad&sid=91877fee-1&lt=2215&pi=-1748725250&lg=en-GB&sw=2560&sh=1440&sc=24&tl=Online%20Betting%20from%20William%20Hill%20-%20The%20Home%20of%20Betting&p=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&r=&rn=3604")
			.headers(headers_18),
            http("request_35")
			.get(uri24 + "/src=4897992;dc_pre=COu2jt2t1NUCFcrhGwodcEwMOw;type=count0;cat=whcat0;u1=SB;u2=;u3=;u4=undefined.undefined;u5=sports;u6=;dc_lat=;dc_rdid=;tag_for_child_directed_treatment=;ord=1;num='%20+%20a%20+%20'")
			.headers(headers_18),
            http("request_36")
			.get(uri28 + "?417397")
			.headers(headers_7),
            http("request_37")
			.get(uri01 + "/714028555430421?v=2.7.19")
			.headers(headers_7),
            http("request_38")
			.get(uri25 + "?a=20487071&sa=1&v=918.2e0ff1d&t=Unnamed%20Transaction&rst=2253&be=785&fe=1229&dc=310&f=%5B%22err%22,%22xhr%22,%22stn%22%5D&perf=%7B%22timing%22:%7B%22of%22:1502632351077,%22n%22:0,%22dl%22:566,%22di%22:1094,%22ds%22:1094,%22de%22:1097,%22dc%22:1988,%22l%22:1988,%22le%22:2215,%22r%22:52,%22re%22:343,%22f%22:343,%22dn%22:343,%22dne%22:343,%22c%22:343,%22ce%22:343,%22rq%22:344,%22rp%22:565,%22rpe%22:566%7D,%22navigation%22:%7B%22rc%22:1%7D%7D&jsonp=NREUM.setToken")
			.headers(headers_7),
            http("request_39")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s28570826868125?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A33%200%20-60&d.&nsid=0&jsonv=1&.d&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&v14=Not%20logged%20in&pe=lnk_o&pev2=Send%20logged%20in%20status&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7),
            http("request_40")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s26489298803005?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A33%200%20-60&d.&nsid=0&jsonv=1&.d&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&v8=1017&pe=lnk_o&pev2=Time%20To%20First%20Bet%20Track&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7),
            http("request_41")
			.get(uri05 + "/betting/en-gb/football.partial")
			.headers(headers_12),
            http("request_42")
			.get(uri05 + "/fragments/sidebarLeft/en-gb/football/highlights")
			.headers(headers_12),
            http("request_43")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_Manual_Football_Mbox_Web&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=970f05cff4b74ca886692324d4123888&mboxVersion=0.9.7&mboxCount=8&mboxTime=1502635954775&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=5311A00D3A0A3FBF-3653810EA995C604&isCustomer=no")
			.headers(headers_8),
            http("request_44")
			.get(uri05 + "/fragments/topBets/en-gb/football")
			.headers(headers_12),
            http("request_45")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_Manual_Football_Mbox_Native&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=970f05cff4b74ca886692324d4123888&mboxVersion=0.9.7&mboxCount=9&mboxTime=1502635954897&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=18309F88047C20CE-163DF09B075D4BE1&isCustomer=no")
			.headers(headers_8),
            http("request_46")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s24940333838973?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A34%200%20-60&d.&nsid=0&jsonv=1&.d&sdid=18309F88047C20CE-163DF09B075D4BE1&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb%3Afootball&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&server=sports.williamhill.com&aamb=NRX38WO0n5BH8Th-nqAG_A&c1=D%3Dg&c2=D%3Dv21&c3=D%3Dv22&c4=D%3Dv23&c5=D%3Dv24&c6=D%3Dv25&c7=D%3Dv26&c8=D%3Dv27&v10=D%3Ds_vi&v12=Non-customer&v13=nonc&c14=D%3Dbw&v14=Not%20logged%20in&c15=1%3A52%20PM&c16=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v20=D%3Dg&v21=sports&v22=betting%20%7C%20football&c23=1%3A52%20PM%7CSunday&v23=football%7CHomepage&v24=en-gb&v25=default&v26=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&v27=Website&c28=TRAFALGAR&c43=Landscape&v60=2%3A52%20PM%7CSunday&v63=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v67=TRAFALGAR&v75=Sun%20Aug%2013%202017&v118=Standard%20Browsing&v122=Flash%20enabled&v132=suggestionsNoCookiePresent&v137=Landscape&pid=sports%3Abetting%3Aen-gb&pidt=1&oid=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&ot=A&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7),
            http("request_47")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_Manual_Football_Mbox_Web&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=970f05cff4b74ca886692324d4123888&mboxVersion=0.9.7&mboxCount=10&mboxTime=1502635955022&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=18309F88047C20CE-163DF09B075D4BE1&isCustomer=no")
			.headers(headers_8),
            http("request_48")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s23010566815550?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A34%200%20-60&d.&nsid=0&jsonv=1&.d&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb%3Afootball&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&pe=lnk_o&pev2=TnT&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7)))
		.pause(1)
		.exec(http("request_49")
			.get(uri05 + "/betting/en-gb/football/competitions.partial")
			.headers(headers_12)
			.resources(http("request_50")
			.get(uri05 + "/fragments/topBets/en-gb/football")
			.headers(headers_12),
            http("request_51")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s28801589744034?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A36%200%20-60&d.&nsid=0&jsonv=1&.d&sdid=7E52FE288E3FF977-0CE463DE93EE90D6&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb%3Afootball%3Acompetitions&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball%2Fcompetitions&server=sports.williamhill.com&aamb=NRX38WO0n5BH8Th-nqAG_A&c1=D%3Dg&c2=D%3Dv21&c3=D%3Dv22&c4=D%3Dv23&c5=D%3Dv24&c6=D%3Dv25&c7=D%3Dv26&c8=D%3Dv27&v10=D%3Ds_vi&v12=Non-customer&v13=nonc&c14=D%3Dbw&v14=Not%20logged%20in&c15=1%3A52%20PM&c16=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v20=D%3Dg&v21=sports&v22=betting%20%7C%20football&c23=1%3A52%20PM%7CSunday&v23=football%7CCompetitions&v24=en-gb&v25=default&v26=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball%2Fcompetitions&v27=Website&c28=TRAFALGAR&c43=Landscape&v60=2%3A52%20PM%7CSunday&v63=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v67=TRAFALGAR&v118=Standard%20Browsing&v122=Flash%20enabled&v132=suggestionsNoCookiePresent&v137=Landscape&pid=sports%3Abetting%3Aen-gb%3Afootball&pidt=1&oid=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball%2Fcompetitions&ot=A&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7),
            http("request_52")
			.get(uri14 + "/8/t.js?s=2374738&t=1502632357381")
			.headers(headers_7),
            http("request_53")
			.get(uri21 + "?v=4&ty=WB")
			.headers(headers_53)
			.check(status.is(101)),
            http("request_54")
			.get(uri14 + "/s?2374738&1502632357&AAA1BZ5904IDXwNiAmECLAAAABFJdGFsaWFuIFN1cGVyIEN1cFRzcG9ydHMud2lsbGlhbWhpbGwuY29tL2JldHRpbmcvZW4tZ2IvZm9vdGJhbGwvY29tcGV0aXRpb25zL0l0YWxpYW4tU3VwZXItQ3VwL21hdGNoZXMA")
			.headers(headers_18)))
		.pause(1)
		.exec(http("request_55")
			.get(uri05 + "/betting/en-gb/football/OB_EV11251944.partial")
			.headers(headers_12)
			.resources(http("request_56")
			.get(uri14 + "/c?2374738&HGcDrQFrAQ4AAAASTWFuIFV0ZCB2IFdlc3QgSGFtSWJ0bWFya2V0X19saW5rLW5hbWUgYnRtYXJrZXRfX2xpbmstbmFtZS0tZWxsaXBzaXMgc2hvdy1mb3ItZGVza3RvcC1tZWRpdW0Af38aAwAtc3BvcnRzLndpbGxpYW1oaWxsLmNvbS9iZXR0aW5nL2VuLWdiL2Zvb3RiYWxsAAAAAAAAAAAAAAA")
			.headers(headers_18),
            http("request_57")
			.get(uri23 + "/510863437/1656011402")
			.headers(headers_57),
            http("request_58")
			.get(uri23 + "/510863440/1656011402")
			.headers(headers_57),
            http("request_59")
			.get(uri23 + "/510863439/1656012395")
			.headers(headers_57),
            http("request_60")
			.get(uri23 + "/510863438/1656011457")
			.headers(headers_57),
            http("request_61")
			.get(uri23 + "/510863442/1656012395")
			.headers(headers_57),
            http("request_62")
			.get(uri23 + "/510863441/1656011457")
			.headers(headers_57),
            http("request_63")
			.get(uri05 + "/fragments/topBets/en-gb/football")
			.headers(headers_12),
            http("request_64")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s2962847562535?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A39%200%20-60&d.&nsid=0&jsonv=1&.d&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb%3Afootball%3Aob_ev11251944%3Aman-utd-vs-west-ham&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball%2FOB_EV11251944%2Fman-utd-vs-west-ham&server=sports.williamhill.com&events=event198&aamb=NRX38WO0n5BH8Th-nqAG_A&c1=D%3Dg&c2=D%3Dv21&c3=D%3Dv22&c4=D%3Dv23&c5=D%3Dv24&c6=D%3Dv25&c7=D%3Dv26&c8=D%3Dv27&v10=D%3Ds_vi&v12=Non-customer&v13=nonc&c14=D%3Dbw&v14=Not%20logged%20in&c15=1%3A52%20PM&c16=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v20=D%3Dg&v21=sports&v22=betting%20%7C%20football&c23=1%3A52%20PM%7CSunday&v23=football%7CEvents&v24=en-gb&v25=default&v26=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball%2FOB_EV11251944%2Fman-utd-vs-west-ham&v27=Website&c28=TRAFALGAR&c43=Landscape&v60=2%3A52%20PM%7CSunday&v63=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v67=TRAFALGAR&v118=Standard%20Browsing&v122=Flash%20enabled&v132=suggestionsNoCookiePresent&v133=football%7CEvents&v137=Landscape&pid=sports%3Abetting%3Aen-gb%3Afootball%3Acompetitions&pidt=1&oid=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball%2FOB_EV11251944%2Fman-utd-vs-west-ham&ot=A&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7)))
		.pause(1)
		.exec(http("request_65")
			.post("/slp/en-gb")
			.headers(headers_65)
			.formParam("action", "GoAddLeg")
			.formParam("leg_sort", "--")
			.formParam("price_type", "L")
			.formParam("lp_num", "1")
			.formParam("lp_den", "3")
			.formParam("hcap_value", "0")
			.formParam("bir_index", "")
			.formParam("ew_places", "")
			.formParam("ew_fac_num", "")
			.formParam("ew_fac_den", "")
			.formParam("ev_oc_id", "1594034958")
			.formParam("combi_sel", "Y")
			.formParam("blockbuster_id", "-1")
			.formParam("switch_tab", "1")
			.formParam("aff_id", "850")
			.formParam("csrf_token", "148744fb0f7191548868")
			.resources(http("request_66")
			.get(uri12 + "?nosubsite=EN&nourl=www.willhill.com/EN/SB/Betslip/AddToSlip&r_betst=d_&f_bet_lang=EN")
			.headers(headers_18),
            http("request_67")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s2144282851662?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A41%200%20-60&d.&nsid=0&jsonv=1&.d&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb%3Afootball%3Aob_ev11251944%3Aman-utd-vs-west-ham&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball%2FOB_EV11251944%2Fman-utd-vs-west-ham&events=scOpen%2CscAdd&products=%3B1594034958&v36=sports%3Abetting%3Aen-gb%3Afootball%3Aob_ev11251944%3Aman-utd-vs-west-ham&v44=Pre%20Match&v70=Man%20Utd%20v%20West%20Ham%7C90%20Minutes%7CEnglish%20Premier%20League%7C13%20Aug%202017&v113=Man%20Utd%7C1.33&pe=lnk_o&pev2=bet%20added%20to%20betslip&pid=sports%3Abetting%3Aen-gb%3Afootball%3Aob_ev11251944%3Aman-utd-vs-west-ham&pidt=1&oid=1%2F3&oidt=3&ot=SUBMIT&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7),
            http("request_68")
			.get(uri19 + "/push_api.html?ver=f381d5982053cc7e8346bc0dae55eb76")
			.headers(headers_0),
            http("request_69")
			.get(uri16 + ""),
            http("request_70")
			.get(uri09 + "?mbox=Custom_Sitewide_Global_Mbox&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=68028efb9fee4f96865a905d592d7267&mboxVersion=0.9.7&mboxCount=1&mboxTime=1502635962484&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&mboxReferrer=&browserHeight=1333&browserWidth=2560&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=1331C36B8DA4829F-021E4DEE8B7D1447")
			.headers(headers_8),
            http("request_71")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_Manual_Mbox_Hero_Web&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=68028efb9fee4f96865a905d592d7267&mboxVersion=0.9.7&mboxCount=2&mboxTime=1502635962595&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=1331C36B8DA4829F-021E4DEE8B7D1447&isCustomer=no")
			.headers(headers_8),
            http("request_72")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_3nd_Manual_Mbox_Hero_Web&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=68028efb9fee4f96865a905d592d7267&mboxVersion=0.9.7&mboxCount=3&mboxTime=1502635962731&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=1331C36B8DA4829F-021E4DEE8B7D1447&isCustomer=no")
			.headers(headers_8),
            http("request_73")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_4nd_Manual_Mbox_Hero_Web&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=68028efb9fee4f96865a905d592d7267&mboxVersion=0.9.7&mboxCount=4&mboxTime=1502635962789&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=1331C36B8DA4829F-021E4DEE8B7D1447&isCustomer=no")
			.headers(headers_8),
            http("request_74")
			.get(uri08 + "/serverComponent.php?r=131407.63730533057&ClientID=154&PageID=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb")
			.headers(headers_7),
            http("request_75")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_Manual_Mbox_Hero_Native&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=68028efb9fee4f96865a905d592d7267&mboxVersion=0.9.7&mboxCount=5&mboxTime=1502635963001&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=1331C36B8DA4829F-021E4DEE8B7D1447&isCustomer=no")
			.headers(headers_8),
            http("request_76")
			.get(uri05 + "/fragments/topBets/en-gb/homepage")
			.headers(headers_12),
            http("request_77")
			.get(uri21 + "?v=4&ty=WB")
			.headers(headers_77)
			.check(status.is(101)),
            http("request_78")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_3nd_Manual_Mbox_Hero_Native&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=68028efb9fee4f96865a905d592d7267&mboxVersion=0.9.7&mboxCount=6&mboxTime=1502635963065&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=1331C36B8DA4829F-021E4DEE8B7D1447&isCustomer=no")
			.headers(headers_8),
            http("request_79")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_4nd_Manual_Mbox_Hero_Native&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=68028efb9fee4f96865a905d592d7267&mboxVersion=0.9.7&mboxCount=7&mboxTime=1502635963130&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=1331C36B8DA4829F-021E4DEE8B7D1447&isCustomer=no")
			.headers(headers_8),
            http("request_80")
			.get(uri07 + "?msg=s%20is%20not%20defined&lnn=-1&fn=&cid=154&client=williamhill&publishPath=migrate&rid=1990005&did=416919&errorName=ReferenceError")
			.headers(headers_18),
            http("request_81")
			.get(uri06 + "?v=4&ty=WB")
			.headers(headers_81)
			.check(status.is(101)),
            http("request_82")
			.get(uri17 + "")
			.headers(headers_2)
			.check(status.is(401)),
            http("request_83")
			.get(uri24 + "/src=4897992;type=count0;cat=whcat0;u1=SB;u2=;u3=;u4=694924369.1502632353;u5=undefined;u6=;dc_lat=;dc_rdid=;tag_for_child_directed_treatment=;ord=1;num='%20+%20a%20+%20'?")
			.headers(headers_18),
            http("request_84")
			.get(uri28 + "?417397")
			.headers(headers_7),
            http("request_85")
			.get(uri24 + "/src=4897992;dc_pre=CN_R_uGt1NUCFZAUGwod18EOkQ;type=count0;cat=whcat0;u1=SB;u2=;u3=;u4=694924369.1502632353;u5=undefined;u6=;dc_lat=;dc_rdid=;tag_for_child_directed_treatment=;ord=1;num='%20+%20a%20+%20'")
			.headers(headers_18),
            http("request_86")
			.get(uri20 + "?ti=4018288&Ver=2&mid=10eb9f0f-202d-e1a9-fa04-0b76bef3ea83&evt=pageLoad&sid=91877fee-0&lt=1307&pi=-1748725250&lg=en-GB&sw=2560&sh=1440&sc=24&tl=Online%20Betting%20from%20William%20Hill%20-%20The%20Home%20of%20Betting&p=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&r=&rn=361986")
			.headers(headers_18),
            http("request_87")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s23487581441321?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A43%200%20-60&d.&nsid=0&jsonv=1&.d&sdid=1331C36B8DA4829F-021E4DEE8B7D1447&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&server=sports.williamhill.com&events=event208&aamb=NRX38WO0n5BH8Th-nqAG_A&c1=D%3Dg&c2=D%3Dv21&c3=D%3Dv22&c4=D%3Dv23&c5=D%3Dv24&c6=D%3Dv25&c7=D%3Dv26&c8=D%3Dv27&v10=D%3Ds_vi&v12=Non-customer&v13=Non-customer&c14=D%3Dbw&v14=Not%20logged%20in&c15=1%3A52%20PM&c16=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v20=D%3Dg&v21=sports&v22=betting&c23=1%3A52%20PM%7CSunday&v23=Homepage&v24=en-gb&v25=default&v26=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&v27=Website&c28=TRAFALGAR&c43=Landscape&v60=2%3A52%20PM%7CSunday&v63=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v67=TRAFALGAR&v75=Sun%20Aug%2013%202017&v118=Standard%20Browsing&v122=Flash%20enabled&v132=suggestionsNoCookiePresent&v137=Landscape&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7),
            http("request_88")
			.get(uri25 + "?a=20487071&sa=1&v=918.2e0ff1d&t=Unnamed%20Transaction&rst=1375&be=279&fe=830&dc=250&f=%5B%22err%22,%22xhr%22,%22stn%22%5D&perf=%7B%22timing%22:%7B%22of%22:1502632362218,%22n%22:0,%22u%22:183,%22ue%22:183,%22dl%22:190,%22di%22:528,%22ds%22:529,%22de%22:531,%22dc%22:1083,%22l%22:1084,%22le%22:1307,%22r%22:0,%22re%22:125,%22f%22:125,%22dn%22:125,%22dne%22:125,%22c%22:125,%22ce%22:125,%22rq%22:125,%22rp%22:179,%22rpe%22:181%7D,%22navigation%22:%7B%22rc%22:1%7D%7D&jsonp=NREUM.setToken")
			.headers(headers_7),
            http("request_89")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s24354008943685?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A43%200%20-60&d.&nsid=0&jsonv=1&.d&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&v14=Not%20logged%20in&pe=lnk_o&pev2=Send%20logged%20in%20status&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7),
            http("request_90")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s24134628211220?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A43%200%20-60&d.&nsid=0&jsonv=1&.d&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&v8=631&pe=lnk_o&pev2=Time%20To%20First%20Bet%20Track&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7)))
		.pause(1)
		.exec(http("request_91")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_Manual_Football_Mbox_Web&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=fe882da706c148958844231bd5f2da3c&mboxVersion=0.9.7&mboxCount=8&mboxTime=1502635965028&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=1331C36B8DA4829F-021E4DEE8B7D1447&isCustomer=no")
			.headers(headers_8)
			.resources(http("request_92")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s27175901954234?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A45%200%20-60&d.&nsid=0&jsonv=1&.d&sdid=437EBC7033919B88-7954E3A473ED4ED8&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb%3Afootball&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&server=sports.williamhill.com&aamb=NRX38WO0n5BH8Th-nqAG_A&c1=D%3Dg&c2=D%3Dv21&c3=D%3Dv22&c4=D%3Dv23&c5=D%3Dv24&c6=D%3Dv25&c7=D%3Dv26&c8=D%3Dv27&v10=D%3Ds_vi&v12=Non-customer&v13=nonc&c14=D%3Dbw&v14=Not%20logged%20in&c15=1%3A52%20PM&c16=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v20=D%3Dg&v21=sports&v22=betting%20%7C%20football&c23=1%3A52%20PM%7CSunday&v23=football%7CHomepage&v24=en-gb&v25=default&v26=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&v27=Website&c28=TRAFALGAR&c43=Landscape&v60=2%3A52%20PM%7CSunday&v63=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v67=TRAFALGAR&v75=Sun%20Aug%2013%202017&v118=Standard%20Browsing&v122=Flash%20enabled&v132=suggestionsNoCookiePresent&v137=Landscape&pid=sports%3Abetting%3Aen-gb&pidt=1&oid=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&ot=A&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7),
            http("request_93")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_Manual_Football_Mbox_Native&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=fe882da706c148958844231bd5f2da3c&mboxVersion=0.9.7&mboxCount=9&mboxTime=1502635965167&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=437EBC7033919B88-7954E3A473ED4ED8&isCustomer=no")
			.headers(headers_8),
            http("request_94")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_Manual_Football_Mbox_Web&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=fe882da706c148958844231bd5f2da3c&mboxVersion=0.9.7&mboxCount=10&mboxTime=1502635965224&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=437EBC7033919B88-7954E3A473ED4ED8&isCustomer=no")
			.headers(headers_8),
            http("request_95")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s2681833534882?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A45%200%20-60&d.&nsid=0&jsonv=1&.d&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb%3Afootball&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&pe=lnk_o&pev2=TnT&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7),
            http("request_96")
			.get(uri05 + "/fragments/topBets/en-gb/football")
			.headers(headers_12),
            http("request_97")
			.get(uri10 + "?cms_redirect=yes&expire=1502646761&ip=5.67.88.202&ipbits=0&mm=28&mn=sn-cn3tc-ac5d&ms=nvh&mt=1502631934&mv=u&pl=22&shardbypass=yes&sparams=expire,ip,ipbits,mm,mn,ms,mv,pl,shardbypass&signature=169E9D8B66C98D0B9E2CB11ECD9DF8EAB4A4D03F.1C3D80F46BD2F2CDAF5064EF3B6D63DC2226DFF5&key=cms1"),
            http("request_98")
			.get(uri05 + "/betting/en-gb/football/competitions.partial")
			.headers(headers_12),
            http("request_99")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s240353117018?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A47%200%20-60&d.&nsid=0&jsonv=1&.d&sdid=71D0A8BB31706A57-2730A04460D47AD9&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb%3Afootball%3Acompetitions&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball%2Fcompetitions&server=sports.williamhill.com&aamb=NRX38WO0n5BH8Th-nqAG_A&c1=D%3Dg&c2=D%3Dv21&c3=D%3Dv22&c4=D%3Dv23&c5=D%3Dv24&c6=D%3Dv25&c7=D%3Dv26&c8=D%3Dv27&v10=D%3Ds_vi&v12=Non-customer&v13=nonc&c14=D%3Dbw&v14=Not%20logged%20in&c15=1%3A52%20PM&c16=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v20=D%3Dg&v21=sports&v22=betting%20%7C%20football&c23=1%3A52%20PM%7CSunday&v23=football%7CCompetitions&v24=en-gb&v25=default&v26=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball%2Fcompetitions&v27=Website&c28=TRAFALGAR&c43=Landscape&v60=2%3A52%20PM%7CSunday&v63=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v67=TRAFALGAR&v118=Standard%20Browsing&v122=Flash%20enabled&v132=suggestionsNoCookiePresent&v137=Landscape&pid=sports%3Abetting%3Aen-gb%3Afootball&pidt=1&oid=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball%2Fcompetitions&ot=A&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7),
            http("request_100")
			.get(uri14 + "/8/t.js?s=2374738&t=1502632367653")
			.headers(headers_7),
            http("request_101")
			.get(uri14 + "/s?2374738&1502632367&AAA1BXF9poIDXwOPAowCLAAAABdTcGFuaXNoIExhIExpZ2EgUHJpbWVyYVpzcG9ydHMud2lsbGlhbWhpbGwuY29tL2JldHRpbmcvZW4tZ2IvZm9vdGJhbGwvY29tcGV0aXRpb25zL1NwYW5pc2gtTGEtTGlnYS1QcmltZXJhL21hdGNoZXMA")
			.headers(headers_18),
            http("request_102")
			.get(uri21 + "?v=4&ty=WB")
			.headers(headers_102)
			.check(status.is(101))))
		.pause(1)
		.exec(http("request_103")
			.get(uri14 + "/c?2374738&HGcDrQFrAQ4AAAASTWFuIFV0ZCB2IFdlc3QgSGFtSWJ0bWFya2V0X19saW5rLW5hbWUgYnRtYXJrZXRfX2xpbmstbmFtZS0tZWxsaXBzaXMgc2hvdy1mb3ItZGVza3RvcC1tZWRpdW0Af38aBAEtc3BvcnRzLndpbGxpYW1oaWxsLmNvbS9iZXR0aW5nL2VuLWdiL2Zvb3RiYWxsAAAAAAAAAAAAAAA")
			.headers(headers_18)
			.resources(http("request_104")
			.get(uri05 + "/fragments/topBets/en-gb/football")
			.headers(headers_12),
            http("request_105")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s27350317657569?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A49%200%20-60&d.&nsid=0&jsonv=1&.d&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb%3Afootball%3Aob_ev11251944%3Aman-utd-vs-west-ham&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball%2FOB_EV11251944%2Fman-utd-vs-west-ham&server=sports.williamhill.com&events=event198&aamb=NRX38WO0n5BH8Th-nqAG_A&c1=D%3Dg&c2=D%3Dv21&c3=D%3Dv22&c4=D%3Dv23&c5=D%3Dv24&c6=D%3Dv25&c7=D%3Dv26&c8=D%3Dv27&v10=D%3Ds_vi&v12=Non-customer&v13=nonc&c14=D%3Dbw&v14=Not%20logged%20in&c15=1%3A52%20PM&c16=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v20=D%3Dg&v21=sports&v22=betting%20%7C%20football&c23=1%3A52%20PM%7CSunday&v23=football%7CEvents&v24=en-gb&v25=default&v26=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball%2FOB_EV11251944%2Fman-utd-vs-west-ham&v27=Website&c28=TRAFALGAR&c43=Landscape&v60=2%3A52%20PM%7CSunday&v63=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v67=TRAFALGAR&v118=Standard%20Browsing&v122=Flash%20enabled&v132=suggestionsNoCookiePresent&v133=football%7CEvents&v137=Landscape&pid=sports%3Abetting%3Aen-gb%3Afootball%3Acompetitions&pidt=1&oid=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball%2FOB_EV11251944%2Fman-utd-vs-west-ham&ot=A&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7),
            http("request_106")
			.post("/slp/en-gb")
			.headers(headers_65)
			.formParam("action", "GoAddLeg")
			.formParam("leg_sort", "--")
			.formParam("price_type", "L")
			.formParam("lp_num", "19")
			.formParam("lp_den", "5")
			.formParam("hcap_value", "0")
			.formParam("bir_index", "")
			.formParam("ew_places", "")
			.formParam("ew_fac_num", "")
			.formParam("ew_fac_den", "")
			.formParam("ev_oc_id", "1594034959")
			.formParam("combi_sel", "Y")
			.formParam("blockbuster_id", "-1")
			.formParam("switch_tab", "1")
			.formParam("aff_id", "850")
			.formParam("csrf_token", "dd05a88ff3256901842b"),
            http("request_107")
			.post(uri19 + "/push")
			.headers(headers_107)
			.body(RawFileBody("BDDScripts_0107_request.txt")),
            http("request_108")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s26631160816471?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A50%200%20-60&d.&nsid=0&jsonv=1&.d&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb%3Afootball%3Aob_ev11251944%3Aman-utd-vs-west-ham&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball%2FOB_EV11251944%2Fman-utd-vs-west-ham&events=scOpen%2CscAdd&products=%3B1594034959&v36=sports%3Abetting%3Aen-gb%3Afootball%3Aob_ev11251944%3Aman-utd-vs-west-ham&v44=Pre%20Match&v70=Man%20Utd%20v%20West%20Ham%7C90%20Minutes%7CEnglish%20Premier%20League%7C13%20Aug%202017&v113=Draw%7C4.80&pe=lnk_o&pev2=bet%20added%20to%20betslip&pid=sports%3Abetting%3Aen-gb%3Afootball%3Aob_ev11251944%3Aman-utd-vs-west-ham&pidt=1&oid=19%2F5&oidt=3&ot=SUBMIT&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7),
            http("request_109")
			.get("/sr-admin-set-white-list-cookie.html")
			.headers(headers_0),
            http("request_110")
			.post(uri19 + "/push")
			.headers(headers_107)
			.body(RawFileBody("BDDScripts_0110_request.txt")),
            http("request_111")
			.get(uri09 + "?mbox=Custom_Sitewide_Global_Mbox&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=5283ea370636465bbab45b5142990e5a&mboxVersion=0.9.7&mboxCount=1&mboxTime=1502635971567&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&mboxReferrer=&browserHeight=1333&browserWidth=2560&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=69D2EDDB07EB127C-73165F46FBC21ACB")
			.headers(headers_8),
            http("request_112")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_Manual_Mbox_Hero_Web&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=5283ea370636465bbab45b5142990e5a&mboxVersion=0.9.7&mboxCount=2&mboxTime=1502635971656&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=69D2EDDB07EB127C-73165F46FBC21ACB&isCustomer=no")
			.headers(headers_8),
            http("request_113")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_3nd_Manual_Mbox_Hero_Web&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=5283ea370636465bbab45b5142990e5a&mboxVersion=0.9.7&mboxCount=3&mboxTime=1502635971733&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=69D2EDDB07EB127C-73165F46FBC21ACB&isCustomer=no")
			.headers(headers_8),
            http("request_114")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_4nd_Manual_Mbox_Hero_Web&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=5283ea370636465bbab45b5142990e5a&mboxVersion=0.9.7&mboxCount=4&mboxTime=1502635971824&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=69D2EDDB07EB127C-73165F46FBC21ACB&isCustomer=no")
			.headers(headers_8),
            http("request_115")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_Manual_Mbox_Hero_Native&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=5283ea370636465bbab45b5142990e5a&mboxVersion=0.9.7&mboxCount=5&mboxTime=1502635971864&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=69D2EDDB07EB127C-73165F46FBC21ACB&isCustomer=no")
			.headers(headers_8),
            http("request_116")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_3nd_Manual_Mbox_Hero_Native&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=5283ea370636465bbab45b5142990e5a&mboxVersion=0.9.7&mboxCount=6&mboxTime=1502635971909&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=69D2EDDB07EB127C-73165F46FBC21ACB&isCustomer=no")
			.headers(headers_8),
            http("request_117")
			.get(uri08 + "/serverComponent.php?r=526.4153189959318&ClientID=154&PageID=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb")
			.headers(headers_7),
            http("request_118")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_4nd_Manual_Mbox_Hero_Native&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=5283ea370636465bbab45b5142990e5a&mboxVersion=0.9.7&mboxCount=7&mboxTime=1502635971941&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=69D2EDDB07EB127C-73165F46FBC21ACB&isCustomer=no")
			.headers(headers_8),
            http("request_119")
			.get(uri07 + "?msg=s%20is%20not%20defined&lnn=-1&fn=&cid=154&client=williamhill&publishPath=migrate&rid=1990005&did=416919&errorName=ReferenceError")
			.headers(headers_18),
            http("request_120")
			.get(uri24 + "/src=4897992;type=count0;cat=whcat0;u1=SB;u2=;u3=;u4=694924369.1502632353;u5=undefined;u6=;dc_lat=;dc_rdid=;tag_for_child_directed_treatment=;ord=1;num='%20+%20a%20+%20'?")
			.headers(headers_18),
            http("request_121")
			.get(uri05 + "/fragments/topBets/en-gb/homepage")
			.headers(headers_12),
            http("request_122")
			.get(uri24 + "/src=4897992;dc_pre=COSbkeat1NUCFYQ8Gwodic0HGg;type=count0;cat=whcat0;u1=SB;u2=;u3=;u4=694924369.1502632353;u5=undefined;u6=;dc_lat=;dc_rdid=;tag_for_child_directed_treatment=;ord=1;num='%20+%20a%20+%20'")
			.headers(headers_18),
            http("request_123")
			.get(uri21 + "?v=4&ty=WB")
			.headers(headers_123)
			.check(status.is(101)),
            http("request_124")
			.get(uri20 + "?ti=4018288&Ver=2&mid=2eff954b-2389-dd75-dd82-c4cf362685cb&evt=pageLoad&sid=91877fee-0&lt=718&pi=-1748725250&lg=en-GB&sw=2560&sh=1440&sc=24&tl=Online%20Betting%20from%20William%20Hill%20-%20The%20Home%20of%20Betting&p=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&r=&rn=323560")
			.headers(headers_18),
            http("request_125")
			.get(uri17 + "")
			.headers(headers_2)
			.check(status.is(401)),
            http("request_126")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s27173608348987?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A52%200%20-60&d.&nsid=0&jsonv=1&.d&sdid=69D2EDDB07EB127C-73165F46FBC21ACB&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&cc=&server=sports.williamhill.com&events=event208&aamb=NRX38WO0n5BH8Th-nqAG_A&c1=D%3Dg&c2=D%3Dv21&c3=D%3Dv22&c4=D%3Dv23&c5=D%3Dv24&c6=D%3Dv25&c7=D%3Dv26&c8=D%3Dv27&c9=D%3Dv28&v10=D%3Ds_vi&v12=Non-customer&v13=nonc&c14=D%3Dbw&v14=Not%20logged%20in&c15=1%3A52%20PM&c16=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v20=D%3Dg&v21=sports&v22=betting&c23=1%3A52%20PM%7CSunday&v23=Homepage&v24=en-gb&v25=default&v26=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&v27=Website&c28=TRAFALGAR&v28=&v42=fraction&c43=Landscape&v60=2%3A52%20PM%7CSunday&v63=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v67=TRAFALGAR&v132=suggestionsNoCookiePresent&v137=Landscape&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7),
            http("request_127")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s26099844672991?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A52%200%20-60&d.&nsid=0&jsonv=1&.d&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&server=sports.williamhill.com&events=event208&aamb=NRX38WO0n5BH8Th-nqAG_A&c1=D%3Dg&c2=D%3Dv21&c3=D%3Dv22&c4=D%3Dv23&c5=D%3Dv24&c6=D%3Dv25&c7=D%3Dv26&c8=D%3Dv27&v10=D%3Ds_vi&v12=Non-customer&v13=Non-customer&c14=D%3Dbw&v14=Not%20logged%20in&c15=1%3A52%20PM&c16=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v20=D%3Dg&v21=sports&v22=betting&c23=1%3A52%20PM%7CSunday&v23=Homepage&v24=en-gb&v25=default&v26=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&v27=Website&c28=TRAFALGAR&c43=Landscape&v60=2%3A52%20PM%7CSunday&v63=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v67=TRAFALGAR&v75=Sun%20Aug%2013%202017&v118=Standard%20Browsing&v122=Flash%20enabled&v132=suggestionsNoCookiePresent&v137=Landscape&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7),
            http("request_128")
			.get(uri25 + "?a=20487071&sa=1&v=918.2e0ff1d&t=Unnamed%20Transaction&rst=787&be=189&fe=456&dc=160&f=%5B%22err%22,%22xhr%22,%22stn%22%5D&perf=%7B%22timing%22:%7B%22of%22:1502632371387,%22n%22:0,%22u%22:137,%22ue%22:137,%22dl%22:144,%22di%22:349,%22ds%22:349,%22de%22:349,%22dc%22:622,%22l%22:622,%22le%22:718,%22r%22:0,%22re%22:91,%22f%22:91,%22dn%22:91,%22dne%22:91,%22c%22:91,%22ce%22:91,%22rq%22:92,%22rp%22:134,%22rpe%22:135%7D,%22navigation%22:%7B%22rc%22:1%7D%7D&jsonp=NREUM.setToken")
			.headers(headers_7),
            http("request_129")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s21413718298705?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A52%200%20-60&d.&nsid=0&jsonv=1&.d&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&v14=Not%20logged%20in&pe=lnk_o&pev2=Send%20logged%20in%20status&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7),
            http("request_130")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s27032831522410?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A52%200%20-60&d.&nsid=0&jsonv=1&.d&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&v8=608&pe=lnk_o&pev2=Time%20To%20First%20Bet%20Track&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7),
            http("request_131")
			.get(uri06 + "?v=4&ty=WB")
			.headers(headers_131)
			.check(status.is(101)),
            http("request_132")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_Manual_Football_Mbox_Web&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=d30bb404b1cb44a999cebe5104229d51&mboxVersion=0.9.7&mboxCount=8&mboxTime=1502635973963&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=69D2EDDB07EB127C-73165F46FBC21ACB&isCustomer=no")
			.headers(headers_8),
            http("request_133")
			.get(uri05 + "/fragments/topBets/en-gb/football")
			.headers(headers_12),
            http("request_134")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s2727519061202?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A54%200%20-60&d.&nsid=0&jsonv=1&.d&sdid=1CAAE1A9FC25F4D1-189E3B0FE47DFC0A&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb%3Afootball&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&server=sports.williamhill.com&aamb=NRX38WO0n5BH8Th-nqAG_A&c1=D%3Dg&c2=D%3Dv21&c3=D%3Dv22&c4=D%3Dv23&c5=D%3Dv24&c6=D%3Dv25&c7=D%3Dv26&c8=D%3Dv27&v10=D%3Ds_vi&v12=Non-customer&v13=nonc&c14=D%3Dbw&v14=Not%20logged%20in&c15=1%3A52%20PM&c16=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v20=D%3Dg&v21=sports&v22=betting%20%7C%20football&c23=1%3A52%20PM%7CSunday&v23=football%7CHomepage&v24=en-gb&v25=default&v26=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&v27=Website&c28=TRAFALGAR&c43=Landscape&v60=2%3A52%20PM%7CSunday&v63=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v67=TRAFALGAR&v75=Sun%20Aug%2013%202017&v118=Standard%20Browsing&v122=Flash%20enabled&v132=suggestionsNoCookiePresent&v137=Landscape&pid=sports%3Abetting%3Aen-gb&pidt=1&oid=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&ot=A&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7),
            http("request_135")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_Manual_Football_Mbox_Native&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=d30bb404b1cb44a999cebe5104229d51&mboxVersion=0.9.7&mboxCount=9&mboxTime=1502635974080&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=1CAAE1A9FC25F4D1-189E3B0FE47DFC0A&isCustomer=no")
			.headers(headers_8),
            http("request_136")
			.get(uri09 + "?mbox=Sportsbook_Trafalgar_Manual_Football_Mbox_Web&mboxSession=a46562ab6f0149758ff321338e9b5bdd&mboxPC=a46562ab6f0149758ff321338e9b5bdd.21_26&mboxPage=d30bb404b1cb44a999cebe5104229d51&mboxVersion=0.9.7&mboxCount=10&mboxTime=1502635974200&mboxHost=sports.williamhill.com&mboxURL=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&mboxReferrer=&browserHeight=1333&browserWidth=2543&browserTimeOffset=60&screenHeight=1440&screenWidth=2560&colorDepth=24&mboxMCGVID=30816588691769361194017323555448625501&mboxAAMB=NRX38WO0n5BH8Th-nqAG_A&mboxMCAVID=&mboxMCGLH=6&vst.trk=metrics.williamhill.com&vst.trks=smetrics.williamhill.com&mboxMCSDID=1CAAE1A9FC25F4D1-189E3B0FE47DFC0A&isCustomer=no")
			.headers(headers_8),
            http("request_137")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s26576195042978?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A54%200%20-60&d.&nsid=0&jsonv=1&.d&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb%3Afootball&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&pe=lnk_o&pev2=TnT&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7),
            http("request_138")
			.get(uri05 + "/betting/en-gb/football/competitions.partial")
			.headers(headers_12),
            http("request_139")
			.get(uri05 + "/fragments/topBets/en-gb/football")
			.headers(headers_12),
            http("request_140")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s23695178905730?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A54%200%20-60&d.&nsid=0&jsonv=1&.d&sdid=2B33C5E5C9EFBB10-5454338F26334095&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb%3Afootball%3Acompetitions&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball%2Fcompetitions&server=sports.williamhill.com&aamb=NRX38WO0n5BH8Th-nqAG_A&c1=D%3Dg&c2=D%3Dv21&c3=D%3Dv22&c4=D%3Dv23&c5=D%3Dv24&c6=D%3Dv25&c7=D%3Dv26&c8=D%3Dv27&v10=D%3Ds_vi&v12=Non-customer&v13=nonc&c14=D%3Dbw&v14=Not%20logged%20in&c15=1%3A52%20PM&c16=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v20=D%3Dg&v21=sports&v22=betting%20%7C%20football&c23=1%3A52%20PM%7CSunday&v23=football%7CCompetitions&v24=en-gb&v25=default&v26=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball%2Fcompetitions&v27=Website&c28=TRAFALGAR&c43=Landscape&v60=2%3A52%20PM%7CSunday&v63=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v67=TRAFALGAR&v118=Standard%20Browsing&v122=Flash%20enabled&v132=suggestionsNoCookiePresent&v137=Landscape&pid=sports%3Abetting%3Aen-gb%3Afootball&pidt=1&oid=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball%2Fcompetitions&ot=A&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7),
            http("request_141")
			.get(uri14 + "/8/t.js?s=2374738&t=1502632375289")
			.headers(headers_7),
            http("request_142")
			.get(uri14 + "/s?2374738&1502632375&AAA1BZ5904IDXwNiAmECLAAAABFJdGFsaWFuIFN1cGVyIEN1cFRzcG9ydHMud2lsbGlhbWhpbGwuY29tL2JldHRpbmcvZW4tZ2IvZm9vdGJhbGwvY29tcGV0aXRpb25zL0l0YWxpYW4tU3VwZXItQ3VwL21hdGNoZXMA")
			.headers(headers_18),
            http("request_143")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s24730470902440?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A56%200%20-60&d.&nsid=0&jsonv=1&.d&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb%3Afootball%3Acompetitions&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball%2Fcompetitions&events=event160&v101=Football%7CMatches&pe=lnk_o&pev2=Football%7CMatches&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7),
            http("request_144")
			.get(uri14 + "/c?2374738&HGcDrQFrAQ4AAAASTWFuIFV0ZCB2IFdlc3QgSGFtSWJ0bWFya2V0X19saW5rLW5hbWUgYnRtYXJrZXRfX2xpbmstbmFtZS0tZWxsaXBzaXMgc2hvdy1mb3ItZGVza3RvcC1tZWRpdW0Af38aAgEtc3BvcnRzLndpbGxpYW1oaWxsLmNvbS9iZXR0aW5nL2VuLWdiL2Zvb3RiYWxsAAAAAAAAAAAAAAA")
			.headers(headers_18),
            http("request_145")
			.get(uri05 + "/fragments/topBets/en-gb/football")
			.headers(headers_12),
            http("request_146")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s23061242510748?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A56%200%20-60&d.&nsid=0&jsonv=1&.d&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb%3Afootball%3Aob_ev11251944%3Aman-utd-vs-west-ham&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball%2FOB_EV11251944%2Fman-utd-vs-west-ham&server=sports.williamhill.com&events=event198&aamb=NRX38WO0n5BH8Th-nqAG_A&c1=D%3Dg&c2=D%3Dv21&c3=D%3Dv22&c4=D%3Dv23&c5=D%3Dv24&c6=D%3Dv25&c7=D%3Dv26&c8=D%3Dv27&v10=D%3Ds_vi&v12=Non-customer&v13=nonc&c14=D%3Dbw&v14=Not%20logged%20in&c15=1%3A52%20PM&c16=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v20=D%3Dg&v21=sports&v22=betting%20%7C%20football&c23=1%3A52%20PM%7CSunday&v23=football%7CEvents&v24=en-gb&v25=default&v26=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball%2FOB_EV11251944%2Fman-utd-vs-west-ham&v27=Website&c28=TRAFALGAR&c43=Landscape&v60=2%3A52%20PM%7CSunday&v63=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F60.0.311290%20Safari%2F537.36&v67=TRAFALGAR&v118=Standard%20Browsing&v122=Flash%20enabled&v132=suggestionsNoCookiePresent&v133=football%7CEvents&v137=Landscape&pid=sports%3Abetting%3Aen-gb%3Afootball%3Acompetitions&pidt=1&oid=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball%2FOB_EV11251944%2Fman-utd-vs-west-ham&ot=A&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7),
            http("request_147")
			.get(uri21 + "?v=4&ty=WB")
			.headers(headers_147)
			.check(status.is(101)),
            http("request_148")
			.get(uri14 + "/c?2374738&RAAAAAAFASMAAAAEMTEvMQ9iZXRidXR0b25fX29kZHMPT0JfT1UxNTk0MDM0OTYwf3saBAE7c3BvcnRzLndpbGxpYW1oaWxsLmNvbS9iZXR0aW5nL2VuLWdiL2Zvb3RiYWxsL09CX0VWMTEyNTE5NDQAAAAAAAAAAAAAAA")
			.headers(headers_18),
            http("request_149")
			.post("/slp/en-gb")
			.headers(headers_65)
			.formParam("action", "GoAddLeg")
			.formParam("leg_sort", "--")
			.formParam("price_type", "L")
			.formParam("lp_num", "11")
			.formParam("lp_den", "1")
			.formParam("hcap_value", "0")
			.formParam("bir_index", "")
			.formParam("ew_places", "")
			.formParam("ew_fac_num", "")
			.formParam("ew_fac_den", "")
			.formParam("ev_oc_id", "1594034960")
			.formParam("combi_sel", "Y")
			.formParam("blockbuster_id", "-1")
			.formParam("switch_tab", "1")
			.formParam("aff_id", "850")
			.formParam("csrf_token", "05faa8ccac1c7407857d"),
            http("request_150")
			.post(uri19 + "/push")
			.headers(headers_107)
			.body(RawFileBody("BDDScripts_0150_request.txt")),
            http("request_151")
			.get(uri02 + "/b/ss/whg-intl-prod-v3/10/JS-2.1.0/s24519138719925?AQB=1&ndh=1&pf=1&callback=s_c_il[1].doPostbacks&et=1&t=13%2F7%2F2017%2014%3A52%3A57%200%20-60&d.&nsid=0&jsonv=1&.d&mid=30816588691769361194017323555448625501&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb%3Afootball%3Aob_ev11251944%3Aman-utd-vs-west-ham&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball%2FOB_EV11251944%2Fman-utd-vs-west-ham&events=scOpen%2CscAdd&products=%3B1594034960&v36=sports%3Abetting%3Aen-gb%3Afootball%3Aob_ev11251944%3Aman-utd-vs-west-ham&v44=Pre%20Match&v70=Man%20Utd%20v%20West%20Ham%7C90%20Minutes%7CEnglish%20Premier%20League%7C13%20Aug%202017&v113=West%20Ham%7C12.00&pe=lnk_o&pev2=bet%20added%20to%20betslip&pid=sports%3Abetting%3Aen-gb%3Afootball%3Aob_ev11251944%3Aman-utd-vs-west-ham&pidt=1&oid=11%2F1&oidt=3&ot=SUBMIT&s=2560x1440&c=24&j=1.6&v=N&k=Y&bw=2560&bh=1333&mcorgid=279422CE52785BCE0A490D4D%40AdobeOrg&AQE=1")
			.headers(headers_7),
            http("request_152")
			.post(uri19 + "/push")
			.headers(headers_107)
			.body(RawFileBody("BDDScripts_0152_request.txt"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}