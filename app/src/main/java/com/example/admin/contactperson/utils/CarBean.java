package com.example.admin.contactperson.utils;

import java.util.List;


public class CarBean {
    /**
     * data : [{"initial":"A","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_9_100.png","masterId":9,"name":"奥迪","saleStatus":1,"uv":2050725,"weight":90},{"initial":"A","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_92_100.png","masterId":92,"name":"阿尔法·罗密欧","saleStatus":1,"uv":63842,"weight":85},{"initial":"A","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_97_100.png","masterId":97,"name":"阿斯顿·马丁","saleStatus":1,"uv":84627,"weight":80},{"initial":"A","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_268_100.png","masterId":268,"name":"ALPINA","saleStatus":1,"uv":6251,"weight":50},{"initial":"B","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_157_100.png","masterId":157,"name":"宝骏","saleStatus":1,"uv":1202580,"weight":70},{"initial":"B","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_3_100.png","masterId":3,"name":"宝马","saleStatus":1,"uv":1909193,"weight":70},{"initial":"B","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_2_100.png","masterId":2,"name":"奔驰","saleStatus":1,"uv":2029170,"weight":70},{"initial":"B","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_26_100.png","masterId":26,"name":"本田","saleStatus":1,"uv":3599645,"weight":70},{"initial":"B","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_5_100.png","masterId":5,"name":"标致","saleStatus":1,"uv":475866,"weight":70},{"initial":"B","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_127_100.png","masterId":127,"name":"别克","saleStatus":1,"uv":1665306,"weight":70},{"initial":"B","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_15_100.png","masterId":15,"name":"比亚迪","saleStatus":1,"uv":513837,"weight":70},{"initial":"B","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_82_100.png","masterId":82,"name":"保时捷","saleStatus":1,"uv":418351,"weight":60},{"initial":"B","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_236_100.png","masterId":236,"name":"宝沃","saleStatus":1,"uv":76587,"weight":60},{"initial":"B","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_59_100.png","masterId":59,"name":"奔腾","saleStatus":1,"uv":158615,"weight":60},{"initial":"B","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_263_100.png","masterId":263,"name":"比速","saleStatus":1,"uv":45893,"weight":60},{"initial":"B","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_211_100.png","masterId":211,"name":"北汽幻速","saleStatus":1,"uv":96997,"weight":50},{"initial":"B","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_195_100.png","masterId":195,"name":"北汽绅宝","saleStatus":1,"uv":318141,"weight":50},{"initial":"B","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_168_100.png","masterId":168,"name":"北汽威旺","saleStatus":1,"uv":32691,"weight":50},{"initial":"B","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_14_100.png","masterId":14,"name":"北汽制造","saleStatus":1,"uv":90762,"weight":50},{"initial":"B","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_216_100.png","masterId":216,"name":"北汽新能源","saleStatus":1,"uv":40019,"weight":45},{"initial":"B","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_163_100.png","masterId":163,"name":"北京","saleStatus":1,"uv":168010,"weight":43},{"initial":"B","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_85_100.png","masterId":85,"name":"宾利","saleStatus":1,"uv":105068,"weight":40},{"initial":"B","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_135_100.png","masterId":135,"name":"布加迪","saleStatus":1,"uv":25505,"weight":40},{"initial":"B","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_172_100.png","masterId":172,"name":"巴博斯","saleStatus":-1,"uv":10508,"weight":30},{"initial":"C","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_136_100.png","masterId":136,"name":"长安","saleStatus":1,"uv":933929,"weight":50},{"initial":"C","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_159_100.png","masterId":159,"name":"长安欧尚","saleStatus":1,"uv":189450,"weight":50},{"initial":"C","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_281_100.png","masterId":281,"name":"长安轻型车","saleStatus":1,"uv":22630,"weight":50},{"initial":"C","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_21_100.png","masterId":21,"name":"长城","saleStatus":1,"uv":81784,"weight":50},{"initial":"C","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_129_100.png","masterId":129,"name":"昌河","saleStatus":1,"uv":32810,"weight":50},{"initial":"C","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_221_100.png","masterId":221,"name":"成功","saleStatus":1,"uv":1910,"weight":50},{"initial":"D","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_8_100.png","masterId":8,"name":"大众","saleStatus":1,"uv":9334227,"weight":70},{"initial":"D","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_197_100.png","masterId":197,"name":"东风风度","saleStatus":1,"uv":22987,"weight":50},{"initial":"D","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_253_100.png","masterId":253,"name":"东风风光","saleStatus":1,"uv":93514,"weight":50},{"initial":"D","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_141_100.png","masterId":141,"name":"东风风神","saleStatus":1,"uv":101746,"weight":50},{"initial":"D","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_115_100.png","masterId":115,"name":"东风风行","saleStatus":1,"uv":204457,"weight":50},{"initial":"D","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_205_100.png","masterId":205,"name":"东风小康","saleStatus":1,"uv":26988,"weight":50},{"initial":"D","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_27_100.png","masterId":27,"name":"东风","saleStatus":1,"uv":41204,"weight":30},{"initial":"D","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_29_100.png","masterId":29,"name":"东南","saleStatus":1,"uv":151227,"weight":25},{"initial":"D","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_113_100.png","masterId":113,"name":"道奇","saleStatus":1,"uv":42144,"weight":20},{"initial":"D","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_179_100.png","masterId":179,"name":"DS","saleStatus":1,"uv":76354,"weight":20},{"initial":"F","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_7_100.png","masterId":7,"name":"丰田","saleStatus":1,"uv":2865075,"weight":70},{"initial":"F","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_17_100.png","masterId":17,"name":"福特","saleStatus":1,"uv":2185068,"weight":70},{"initial":"F","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_40_100.png","masterId":40,"name":"菲亚特","saleStatus":1,"uv":35302,"weight":60},{"initial":"F","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_91_100.png","masterId":91,"name":"法拉利","saleStatus":1,"uv":129458,"weight":50},{"initial":"F","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_199_100.png","masterId":199,"name":"飞驰商务车","saleStatus":1,"uv":4745,"weight":50},{"initial":"F","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_67_100.png","masterId":67,"name":"福迪","saleStatus":1,"uv":12341,"weight":50},{"initial":"F","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_208_100.png","masterId":208,"name":"福汽启腾","saleStatus":1,"uv":4321,"weight":50},{"initial":"F","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_128_100.png","masterId":128,"name":"福田","saleStatus":1,"uv":59900,"weight":50},{"initial":"F","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_257_100.png","masterId":257,"name":"Faraday Future","saleStatus":0,"uv":2605,"weight":45},{"initial":"G","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_147_100.png","masterId":147,"name":"广汽传祺","saleStatus":1,"uv":675101,"weight":70},{"initial":"G","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_63_100.png","masterId":63,"name":"广汽吉奥","saleStatus":1,"uv":7532,"weight":50},{"initial":"G","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_133_100.png","masterId":133,"name":"广汽日野","saleStatus":-1,"uv":335,"weight":50},{"initial":"G","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_182_100.png","masterId":182,"name":"观致","saleStatus":1,"uv":55829,"weight":50},{"initial":"G","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_109_100.png","masterId":109,"name":"GMC","saleStatus":1,"uv":32248,"weight":40},{"initial":"G","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_110_100.png","masterId":110,"name":"光冈","saleStatus":-1,"uv":3126,"weight":40},{"initial":"H","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_196_100.png","masterId":196,"name":"哈弗","saleStatus":1,"uv":1117865,"weight":70},{"initial":"H","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_32_100.png","masterId":32,"name":"海马","saleStatus":1,"uv":126446,"weight":70},{"initial":"H","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_259_100.png","masterId":259,"name":"汉腾","saleStatus":1,"uv":32205,"weight":70},{"initial":"H","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_58_100.png","masterId":58,"name":"红旗","saleStatus":1,"uv":68513,"weight":70},{"initial":"H","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_112_100.png","masterId":112,"name":"华泰","saleStatus":1,"uv":29620,"weight":70},{"initial":"H","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_31_100.png","masterId":31,"name":"哈飞","saleStatus":1,"uv":6885,"weight":50},{"initial":"H","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_170_100.png","masterId":170,"name":"海格","saleStatus":1,"uv":2744,"weight":50},{"initial":"H","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_108_100.png","masterId":108,"name":"悍马","saleStatus":-1,"uv":17207,"weight":50},{"initial":"H","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_181_100.png","masterId":181,"name":"恒天","saleStatus":1,"uv":847,"weight":50},{"initial":"H","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_262_100.png","masterId":262,"name":"华凯","saleStatus":1,"uv":256,"weight":50},{"initial":"H","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_52_100.png","masterId":52,"name":"黄海","saleStatus":1,"uv":16860,"weight":50},{"initial":"H","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_44_100.png","masterId":44,"name":"华普","saleStatus":-1,"uv":1599,"weight":50},{"initial":"H","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_225_100.png","masterId":225,"name":"华颂","saleStatus":1,"uv":4332,"weight":50},{"initial":"H","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_45_100.png","masterId":45,"name":"汇众","saleStatus":1,"uv":1828,"weight":50},{"initial":"J","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_34_100.png","masterId":34,"name":"吉利","saleStatus":1,"uv":1205724,"weight":90},{"initial":"J","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_35_100.png","masterId":35,"name":"江淮","saleStatus":1,"uv":272601,"weight":85},{"initial":"J","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_98_100.png","masterId":98,"name":"捷豹","saleStatus":1,"uv":245528,"weight":80},{"initial":"J","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_4_100.png","masterId":4,"name":"Jeep","saleStatus":1,"uv":644176,"weight":80},{"initial":"J","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_37_100.png","masterId":37,"name":"江铃","saleStatus":1,"uv":65722,"weight":50},{"initial":"J","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_39_100.png","masterId":39,"name":"金杯","saleStatus":1,"uv":85749,"weight":50},{"initial":"J","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_57_100.png","masterId":57,"name":"金龙","saleStatus":1,"uv":6415,"weight":50},{"initial":"J","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_161_100.png","masterId":161,"name":"金旅","saleStatus":1,"uv":7385,"weight":50},{"initial":"J","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_152_100.png","masterId":152,"name":"九龙","saleStatus":1,"uv":10959,"weight":50},{"initial":"J","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_277_100.png","masterId":277,"name":"吉威新能源","saleStatus":1,"uv":1481,"weight":50},{"initial":"K","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_107_100.png","masterId":107,"name":"凯迪拉克","saleStatus":1,"uv":419142,"weight":80},{"initial":"K","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_220_100.png","masterId":220,"name":"凯翼","saleStatus":1,"uv":22615,"weight":70},{"initial":"K","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_51_100.png","masterId":51,"name":"克莱斯勒","saleStatus":1,"uv":25946,"weight":70},{"initial":"K","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_150_100.png","masterId":150,"name":"开瑞","saleStatus":1,"uv":19917,"weight":50},{"initial":"K","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_214_100.png","masterId":214,"name":"卡升","saleStatus":1,"uv":2520,"weight":50},{"initial":"K","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_213_100.png","masterId":213,"name":"卡威","saleStatus":1,"uv":6195,"weight":50},{"initial":"K","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_218_100.png","masterId":218,"name":"科瑞斯的","saleStatus":1,"uv":7967,"weight":50},{"initial":"K","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_145_100.png","masterId":145,"name":"科尼赛克","saleStatus":1,"uv":6750,"weight":50},{"initial":"K","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_212_100.png","masterId":212,"name":"KTM","saleStatus":1,"uv":2387,"weight":50},{"initial":"K","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_188_100.png","masterId":188,"name":"卡尔森","saleStatus":-1,"uv":1096,"weight":40},{"initial":"K","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_241_100.png","masterId":241,"name":"康迪全球鹰","saleStatus":1,"uv":6349,"weight":40},{"initial":"L","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_94_100.png","masterId":94,"name":"雷克萨斯","saleStatus":1,"uv":423621,"weight":80},{"initial":"L","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_99_100.png","masterId":99,"name":"雷诺","saleStatus":1,"uv":128971,"weight":80},{"initial":"L","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_267_100.png","masterId":267,"name":"领克","saleStatus":0,"uv":36427,"weight":80},{"initial":"L","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_95_100.png","masterId":95,"name":"林肯","saleStatus":1,"uv":196286,"weight":80},{"initial":"L","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_36_100.png","masterId":36,"name":"陆风","saleStatus":1,"uv":102379,"weight":80},{"initial":"L","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_96_100.png","masterId":96,"name":"路虎","saleStatus":1,"uv":399981,"weight":80},{"initial":"L","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_76_100.png","masterId":76,"name":"力帆","saleStatus":1,"uv":78278,"weight":70},{"initial":"L","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_16_100.png","masterId":16,"name":"铃木","saleStatus":1,"uv":348040,"weight":70},{"initial":"L","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_80_100.png","masterId":80,"name":"劳斯莱斯","saleStatus":1,"uv":75651,"weight":60},{"initial":"L","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_86_100.png","masterId":86,"name":"兰博基尼","saleStatus":1,"uv":104655,"weight":50},{"initial":"L","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_146_100.png","masterId":146,"name":"莲花","saleStatus":1,"uv":8695,"weight":50},{"initial":"L","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_153_100.png","masterId":153,"name":"猎豹","saleStatus":1,"uv":167013,"weight":50},{"initial":"L","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_166_100.png","masterId":166,"name":"理念","saleStatus":1,"uv":4834,"weight":50},{"initial":"L","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_249_100.png","masterId":249,"name":"陆地方舟","saleStatus":1,"uv":3871,"weight":50},{"initial":"L","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_278_100.png","masterId":278,"name":"罗伦士","saleStatus":1,"uv":3670,"weight":50},{"initial":"L","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_83_100.png","masterId":83,"name":"路特斯","saleStatus":1,"uv":13585,"weight":50},{"initial":"L","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_200_100.png","masterId":200,"name":"蓝海房车","saleStatus":1,"uv":5857,"weight":40},{"initial":"L","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_229_100.png","masterId":229,"name":"雷丁","saleStatus":1,"uv":2554,"weight":40},{"initial":"M","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_18_100.png","masterId":18,"name":"马自达","saleStatus":1,"uv":759591,"weight":80},{"initial":"M","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_79_100.png","masterId":79,"name":"名爵","saleStatus":1,"uv":200219,"weight":80},{"initial":"M","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_81_100.png","masterId":81,"name":"MINI","saleStatus":1,"uv":112282,"weight":80},{"initial":"M","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_88_100.png","masterId":88,"name":"迈巴赫","saleStatus":-1,"uv":13862,"weight":50},{"initial":"M","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_183_100.png","masterId":183,"name":"迈凯伦","saleStatus":1,"uv":55115,"weight":50},{"initial":"M","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_93_100.png","masterId":93,"name":"玛莎拉蒂","saleStatus":1,"uv":194209,"weight":50},{"initial":"M","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_55_100.png","masterId":55,"name":"美亚","saleStatus":-1,"uv":675,"weight":50},{"initial":"M","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_201_100.png","masterId":201,"name":"摩根","saleStatus":1,"uv":6960,"weight":40},{"initial":"N","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_155_100.png","masterId":155,"name":"纳智捷","saleStatus":1,"uv":63289,"weight":50},{"initial":"O","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_84_100.png","masterId":84,"name":"讴歌","saleStatus":1,"uv":75404,"weight":90},{"initial":"O","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_104_100.png","masterId":104,"name":"欧宝","saleStatus":-1,"uv":4073,"weight":50},{"initial":"O","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_171_100.png","masterId":171,"name":"欧朗","saleStatus":-1,"uv":525,"weight":50},{"initial":"P","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_185_100.png","masterId":185,"name":"帕加尼","saleStatus":1,"uv":7484,"weight":50},{"initial":"Q","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_42_100.png","masterId":42,"name":"奇瑞","saleStatus":1,"uv":388247,"weight":90},{"initial":"Q","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_156_100.png","masterId":156,"name":"启辰","saleStatus":1,"uv":143348,"weight":70},{"initial":"Q","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_28_100.png","masterId":28,"name":"起亚","saleStatus":1,"uv":575412,"weight":70},{"initial":"Q","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_43_100.png","masterId":43,"name":"庆铃","saleStatus":1,"uv":10148,"weight":50},{"initial":"R","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_30_100.png","masterId":30,"name":"日产","saleStatus":1,"uv":1548209,"weight":50},{"initial":"R","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_78_100.png","masterId":78,"name":"荣威","saleStatus":1,"uv":345376,"weight":50},{"initial":"R","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_142_100.png","masterId":142,"name":"瑞麒","saleStatus":-1,"uv":2977,"weight":50},{"initial":"S","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_10_100.png","masterId":10,"name":"斯柯达","saleStatus":1,"uv":587980,"weight":90},{"initial":"S","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_111_100.png","masterId":111,"name":"斯巴鲁","saleStatus":1,"uv":119751,"weight":80},{"initial":"S","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_89_100.png","masterId":89,"name":"smart","saleStatus":1,"uv":55299,"weight":80},{"initial":"S","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_260_100.png","masterId":260,"name":"SWM斯威","saleStatus":1,"uv":36144,"weight":80},{"initial":"S","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_103_100.png","masterId":103,"name":"萨博","saleStatus":-1,"uv":1553,"weight":50},{"initial":"S","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_239_100.png","masterId":239,"name":"赛麟","saleStatus":1,"uv":5379,"weight":50},{"initial":"S","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_25_100.png","masterId":25,"name":"三菱","saleStatus":1,"uv":607675,"weight":50},{"initial":"S","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_165_100.png","masterId":165,"name":"上汽大通","saleStatus":1,"uv":133646,"weight":50},{"initial":"S","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_209_100.png","masterId":209,"name":"山姆","saleStatus":1,"uv":18470,"weight":50},{"initial":"S","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_169_100.png","masterId":169,"name":"陕汽通家","saleStatus":1,"uv":1506,"weight":50},{"initial":"S","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_137_100.png","masterId":137,"name":"世爵","saleStatus":1,"uv":4048,"weight":50},{"initial":"S","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_50_100.png","masterId":50,"name":"双环","saleStatus":-1,"uv":5018,"weight":50},{"initial":"S","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_102_100.png","masterId":102,"name":"双龙","saleStatus":1,"uv":31431,"weight":50},{"initial":"T","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_189_100.png","masterId":189,"name":"特斯拉","saleStatus":1,"uv":75637,"weight":80},{"initial":"T","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_175_100.png","masterId":175,"name":"腾势","saleStatus":1,"uv":4299,"weight":80},{"initial":"T","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_202_100.png","masterId":202,"name":"泰卡特","saleStatus":1,"uv":13350,"weight":50},{"initial":"T","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_54_100.png","masterId":54,"name":"天马","saleStatus":-1,"uv":468,"weight":50},{"initial":"W","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_48_100.png","masterId":48,"name":"五菱","saleStatus":1,"uv":278820,"weight":90},{"initial":"W","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_19_100.png","masterId":19,"name":"沃尔沃","saleStatus":1,"uv":477471,"weight":85},{"initial":"W","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_270_100.png","masterId":270,"name":"WEY","saleStatus":1,"uv":226427,"weight":80},{"initial":"W","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_266_100.png","masterId":266,"name":"蔚来","saleStatus":1,"uv":8956,"weight":80},{"initial":"W","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_132_100.png","masterId":132,"name":"五十铃","saleStatus":1,"uv":47866,"weight":75},{"initial":"W","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_247_100.png","masterId":247,"name":"潍柴欧睿","saleStatus":1,"uv":692,"weight":50},{"initial":"W","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_207_100.png","masterId":207,"name":"潍柴英致","saleStatus":1,"uv":13466,"weight":50},{"initial":"W","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_140_100.png","masterId":140,"name":"威麟","saleStatus":1,"uv":3188,"weight":50},{"initial":"W","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_186_100.png","masterId":186,"name":"威兹曼","saleStatus":1,"uv":2758,"weight":50},{"initial":"X","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_49_100.png","masterId":49,"name":"雪佛兰","saleStatus":1,"uv":900097,"weight":80},{"initial":"X","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_6_100.png","masterId":6,"name":"雪铁龙","saleStatus":1,"uv":355277,"weight":80},{"initial":"X","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_13_100.png","masterId":13,"name":"现代","saleStatus":1,"uv":842653,"weight":50},{"initial":"X","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_174_100.png","masterId":174,"name":"星客特","saleStatus":1,"uv":7860,"weight":50},{"initial":"X","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_71_100.png","masterId":71,"name":"新凯","saleStatus":1,"uv":2046,"weight":50},{"initial":"X","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_62_100.png","masterId":62,"name":"新雅途","saleStatus":-1,"uv":268,"weight":50},{"initial":"X","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_87_100.png","masterId":87,"name":"西雅特","saleStatus":1,"uv":3257,"weight":50},{"initial":"Y","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_100_100.png","masterId":100,"name":"英菲尼迪","saleStatus":1,"uv":210854,"weight":80},{"initial":"Y","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_258_100.png","masterId":258,"name":"驭胜","saleStatus":1,"uv":58192,"weight":80},{"initial":"Y","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_138_100.png","masterId":138,"name":"野马","saleStatus":1,"uv":38976,"weight":50},{"initial":"Y","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_53_100.png","masterId":53,"name":"一汽","saleStatus":1,"uv":131515,"weight":50},{"initial":"Y","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_41_100.png","masterId":41,"name":"依维柯","saleStatus":1,"uv":58042,"weight":50},{"initial":"Y","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_75_100.png","masterId":75,"name":"永源","saleStatus":-1,"uv":1183,"weight":50},{"initial":"Y","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_178_100.png","masterId":178,"name":"宇通","saleStatus":1,"uv":4533,"weight":50},{"initial":"Z","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_77_100.png","masterId":77,"name":"众泰","saleStatus":1,"uv":511894,"weight":90},{"initial":"Z","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_60_100.png","masterId":60,"name":"中华","saleStatus":1,"uv":90480,"weight":80},{"initial":"Z","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_233_100.png","masterId":233,"name":"知豆","saleStatus":1,"uv":20774,"weight":50},{"initial":"Z","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_203_100.png","masterId":203,"name":"之诺","saleStatus":1,"uv":3047,"weight":50},{"initial":"Z","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_33_100.png","masterId":33,"name":"中兴","saleStatus":1,"uv":16346,"weight":50},{"initial":"Z","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_167_100.png","masterId":167,"name":"中欧房车","saleStatus":1,"uv":17630,"weight":40},{"initial":"Z","logoUrl":"http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_246_100.png","masterId":246,"name":"重汽王牌","saleStatus":1,"uv":1189,"weight":40}]
     * message : ok
     * status : 1
     */

    private String message;
    private int status;
    private List<CarInfo> data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<CarInfo> getData() {
        return data;
    }

    public void setData(List<CarInfo> data) {
        this.data = data;
    }

    public static class CarInfo {
        /**
         * initial : A
         * logoUrl : http://image.bitautoimg.com/bt/car/default/images/logo/masterbrand/png/100/m_9_100.png
         * masterId : 9
         * name : 奥迪
         * saleStatus : 1
         * uv : 2050725
         * weight : 90
         */

        private String initial;
        private String logoUrl;
        private int masterId;
        private String name;
        private int saleStatus;
        private int uv;
        private int weight;

        public String getInitial() {
            return initial;
        }

        public void setInitial(String initial) {
            this.initial = initial;
        }

        public String getLogoUrl() {
            return logoUrl;
        }

        public void setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
        }

        public int getMasterId() {
            return masterId;
        }

        public void setMasterId(int masterId) {
            this.masterId = masterId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSaleStatus() {
            return saleStatus;
        }

        public void setSaleStatus(int saleStatus) {
            this.saleStatus = saleStatus;
        }

        public int getUv() {
            return uv;
        }

        public void setUv(int uv) {
            this.uv = uv;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }
}