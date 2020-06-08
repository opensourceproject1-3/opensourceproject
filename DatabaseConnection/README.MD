데이터베이스 구조
![screenshot](datastruct.jpg)


### Dothome

### FileZilla
호스트 : sehwa98.dothome.co.kr
사용자명 : sehwa98
비밀번호 : 쉿비밀><
포트 : 21

### 주요파일

Product.php : PRODUCT 접근, 불러오기

Store.php : STORE 접근, 불러오기

Login.php : USER 접근, 불러오기

Register.php : USER 접근, 데이터 추가

images/PRODUCT_00 : PRODUCT:productImage 데이터



### Data insert in phpmyadmin ( sehwa98.dothome.co.kr/myadmin )

INSERT INTO `STORE` (`storeID`, `storeName`, `storeTime`, `categoryID`) VALUES ('STORE_2', '대우축산', '09:00~20:00', 'CATEGORY_1');


##### STORE


insert into STORE values ('STORE_3', "시민닭집", "09:00~20:00", 'CATEGORY_1');
insert into STORE values ('STORE_4', "유천상회", "09:00~20:00", 'CATEGORY_1');
insert into STORE values ('STORE_5', "토종누렁이한우종가", "09:00~20:00", 'CATEGORY_1');
insert into STORE values ('STORE_6', "농심축산", "09:00~20:00", 'CATEGORY_1');
insert into STORE values ('STORE_7', "꼬꼬와오리나라", "09:00~20:00", 'CATEGORY_1');
insert into STORE values ('STORE_8', "장군축산", "09:00~20:00", 'CATEGORY_1');
insert into STORE values ('STORE_9', "하나로축산", "09:00~20:00", 'CATEGORY_1');
insert into STORE values ('STORE_10', "성은유통", "09:00~20:00", 'CATEGORY_1');

insert into STORE values ('STORE_11', "광명민물수산", "09:00~20:00", 'CATEGORY_2');
insert into STORE values ('STORE_12', "바다맛수산", "09:00~20:00", 'CATEGORY_2');
insert into STORE values ('STORE_13', "세명수산", "09:00~20:00", 'CATEGORY_2');
insert into STORE values ('STORE_14', "정진상회", "09:00~20:00", 'CATEGORY_2');
insert into STORE values ('STORE_15', "총각네", "09:00~20:00", 'CATEGORY_2');
insert into STORE values ('STORE_16', "홍성해물", "09:00~20:00", 'CATEGORY_2');
insert into STORE values ('STORE_17', "소래포구", "09:00~20:00", 'CATEGORY_2');
insert into STORE values ('STORE_18', "완도네해물", "09:00~20:00", 'CATEGORY_2');
insert into STORE values ('STORE_19', "영진젓갈", "09:00~20:00", 'CATEGORY_2');
insert into STORE values ('STORE_20', "성진민물", "09:00~20:00", 'CATEGORY_2');

insert into STORE values ('STORE_21', "바다향기", "09:00~20:00", 'CATEGORY_3');
insert into STORE values ('STORE_22', "구천상회", "09:00~20:00", 'CATEGORY_3');
insert into STORE values ('STORE_23', "달인광천김", "09:00~20:00", 'CATEGORY_3');
insert into STORE values ('STORE_24', "미래건어물", "09:00~20:00", 'CATEGORY_3');
insert into STORE values ('STORE_25', "창수네건어물", "09:00~20:00", 'CATEGORY_3');
insert into STORE values ('STORE_26', "주신푸드", "09:00~20:00", 'CATEGORY_3');
insert into STORE values ('STORE_27', "쌍둥이건어물", "09:00~20:00", 'CATEGORY_3');
insert into STORE values ('STORE_28', "광명푸드", "09:00~20:00", 'CATEGORY_3');
insert into STORE values ('STORE_29', "남해김집", "09:00~20:00", 'CATEGORY_3');
insert into STORE values ('STORE_30', "건어물상회", "09:00~20:00", 'CATEGORY_3');

insert into STORE values ('STORE_31', "대성상회", "09:00~20:00", 'CATEGORY_4');
insert into STORE values ('STORE_32', "뚝배기반찬", "09:00~20:00", 'CATEGORY_4');
insert into STORE values ('STORE_33', "은영야채", "09:00~20:00", 'CATEGORY_4');
insert into STORE values ('STORE_34', "세명과일", "09:00~20:00", 'CATEGORY_4');
insert into STORE values ('STORE_35', "원앙청과", "09:00~20:00", 'CATEGORY_4');
insert into STORE values ('STORE_36', "안심야채", "09:00~20:00", 'CATEGORY_4');
insert into STORE values ('STORE_37', "우리농산물", "09:00~20:00", 'CATEGORY_4');
insert into STORE values ('STORE_38', "군산상회", "09:00~20:00", 'CATEGORY_4');
insert into STORE values ('STORE_39', "일번청과", "09:00~20:00", 'CATEGORY_4');
insert into STORE values ('STORE_40', "영수과일", "09:00~20:00", 'CATEGORY_4');

insert into STORE values ('STORE_41', "오뚜기견과", "09:00~20:00", 'CATEGORY_5');
insert into STORE values ('STORE_42', "중앙견과", "09:00~20:00", 'CATEGORY_5');
insert into STORE values ('STORE_43', "황금씨앗", "09:00~20:00", 'CATEGORY_5');
insert into STORE values ('STORE_44', "화영식품", "09:00~20:00", 'CATEGORY_5');
insert into STORE values ('STORE_45', "불로건강원", "09:00~20:00", 'CATEGORY_5');
insert into STORE values ('STORE_46', "옥설선식", "09:00~20:00", 'CATEGORY_5');
insert into STORE values ('STORE_47', "현미와누룽지", "09:00~20:00", 'CATEGORY_5');
insert into STORE values ('STORE_48', "설악건강마을", "09:00~20:00", 'CATEGORY_5');
insert into STORE values ('STORE_49', "형제견과", "09:00~20:00", 'CATEGORY_5');
insert into STORE values ('STORE_50', "정세식품", "09:00~20:00", 'CATEGORY_5');

insert into STORE values ('STORE_51', "광명할머니왕족발", "09:00~20:00", 'CATEGORY_6');
insert into STORE values ('STORE_52', "남매분식", "09:00~20:00", 'CATEGORY_6');
insert into STORE values ('STORE_53', "장릉왕떡갈비", "09:00~20:00", 'CATEGORY_6');
insert into STORE values ('STORE_54', "정희네수입축산", "09:00~20:00", 'CATEGORY_6');
insert into STORE values ('STORE_55', "만나웰빙", "09:00~20:00", 'CATEGORY_6');
insert into STORE values ('STORE_56', "섹시한떡볶이", "09:00~20:00", 'CATEGORY_6');
insert into STORE values ('STORE_57', "짱치킨", "09:00~20:00", 'CATEGORY_6');
insert into STORE values ('STORE_58', "장보옥수제돈가스", "09:00~20:00", 'CATEGORY_6');
insert into STORE values ('STORE_59', "빵굽는동네", "09:00~20:00", 'CATEGORY_6');
insert into STORE values ('STORE_60', "별미집", "09:00~20:00", 'CATEGORY_6');


##### PRODUCT


insert into PRODUCT values ('PRODUCT_1', '삼계탕', '2000','sehwa98.dothome.co.kr/images/PRODUCT_1.PNG', 'STORE_1', 'CATEGORY_1','1개');
insert into PRODUCT values ('PRODUCT_2', '대란', '4200','sehwa98.dothome.co.kr/images/PRODUCT_2.PNG', 'STORE_1', 'CATEGORY_1','1판'); 
insert into PRODUCT values ('PRODUCT_3', '국거리', '4400','sehwa98.dothome.co.kr/images/PRODUCT_3.PNG', 'STORE_2', 'CATEGORY_1','100g');
insert into PRODUCT values ('PRODUCT_4', '생닭(소)', '2500','sehwa98.dothome.co.kr/images/PRODUCT_4.PNG', 'STORE_2', 'CATEGORY_1','1마리');
insert into PRODUCT values ('PRODUCT_5', '부채살', '8500','sehwa98.dothome.co.kr/images/PRODUCT_5.PNG', 'STORE_3', 'CATEGORY_1','100g');
insert into PRODUCT values ('PRODUCT_6', '등갈비', '1150','sehwa98.dothome.co.kr/images/PRODUCT_6.PNG', 'STORE_3', 'CATEGORY_1','100g');

insert into PRODUCT values ('PRODUCT_7', '꽃등심', '10000','sehwa98.dothome.co.kr/images/PRODUCT_7.PNG', 'STORE_4', 'CATEGORY_1','1팩');
insert into PRODUCT values ('PRODUCT_8', '치맛살', '18300','sehwa98.dothome.co.kr/images/PRODUCT_8.PNG', 'STORE_4', 'CATEGORY_1','200g');
insert into PRODUCT values ('PRODUCT_9', '한우안심', '11000','sehwa98.dothome.co.kr/images/PRODUCT_9.PNG', 'STORE_5', 'CATEGORY_1','100g');
insert into PRODUCT values ('PRODUCT_10', '생삼겹살', '10000','sehwa98.dothome.co.kr/images/PRODUCT_10.PNG', 'STORE_5', 'CATEGORY_1','1근');
insert into PRODUCT values ('PRODUCT_11', '제주흑돼지', '10000','sehwa98.dothome.co.kr/images/PRODUCT_11.PNG', 'STORE_6', 'CATEGORY_1','3근');
insert into PRODUCT values ('PRODUCT_12', '삼계닭', '2500','sehwa98.dothome.co.kr/images/PRODUCT_12.PNG', 'STORE_6', 'CATEGORY_1','1마리');
insert into PRODUCT values ('PRODUCT_13', '살치살', '10000','sehwa98.dothome.co.kr/images/PRODUCT_13.PNG', 'STORE_7', 'CATEGORY_1','1팩');
insert into PRODUCT values ('PRODUCT_14', '벌집삼겹살', '20000','sehwa98.dothome.co.kr/images/PRODUCT_14.PNG', 'STORE_7', 'CATEGORY_1','1kg');
insert into PRODUCT values ('PRODUCT_15', '양갈비', '4200','sehwa98.dothome.co.kr/images/PRODUCT_15.PNG', 'STORE_8', 'CATEGORY_1','100g');
insert into PRODUCT values ('PRODUCT_16', '고추장불고기', '6000','sehwa98.dothome.co.kr/images/PRODUCT_16.PNG', 'STORE_8', 'CATEGORY_1','600g');
insert into PRODUCT values ('PRODUCT_17', '소불고기', '10000','sehwa98.dothome.co.kr/images/PRODUCT_17.PNG', 'STORE_9', 'CATEGORY_1','600g');
insert into PRODUCT values ('PRODUCT_18', '왕갈비', '10000','sehwa98.dothome.co.kr/images/PRODUCT_18.PNG', 'STORE_9', 'CATEGORY_1','4개');
insert into PRODUCT values ('PRODUCT_19', '돼지사태', '5700','sehwa98.dothome.co.kr/images/PRODUCT_19.PNG', 'STORE_10', 'CATEGORY_1','1근');
insert into PRODUCT values ('PRODUCT_20', '하림닭', '5000','sehwa98.dothome.co.kr/images/PRODUCT_20.PNG', 'STORE_10', 'CATEGORY_1','1마리');

insert into PRODUCT values ('PRODUCT_21', '광어회 ', '15000','sehwa98.dothome.co.kr/images/PRODUCT_21.jpg', 'STORE_11', 'CATEGORY_2','1팩');
insert into PRODUCT values ('PRODUCT_22', '물메기 ', '8000','sehwa98.dothome.co.kr/images/PRODUCT_22.jpg', 'STORE_11', 'CATEGORY_2','1마리');
insert into PRODUCT values ('PRODUCT_23', '참가자미 ', '10000','sehwa98.dothome.co.kr/images/PRODUCT_23.jpg', 'STORE_12', 'CATEGORY_2','2마리');
insert into PRODUCT values ('PRODUCT_24', '삼치 ', '6000','sehwa98.dothome.co.kr/images/PRODUCT_24.jpg', 'STORE_12', 'CATEGORY_2','2마리');
insert into PRODUCT values ('PRODUCT_25', '고급알탕 ', '10000','sehwa98.dothome.co.kr/images/PRODUCT_25.jpg', 'STORE_13', 'CATEGORY_2','1팩');
insert into PRODUCT values ('PRODUCT_26', '제주갈치 ', '20000','sehwa98.dothome.co.kr/images/PRODUCT_26.jpg', 'STORE_13', 'CATEGORY_2','1팩');
insert into PRODUCT values ('PRODUCT_27', '조기 ', '10000','sehwa98.dothome.co.kr/images/PRODUCT_27.jpg', 'STORE_14', 'CATEGORY_2','7마리');
insert into PRODUCT values ('PRODUCT_28', '생새우 ', '5000','sehwa98.dothome.co.kr/images/PRODUCT_28.jpg', 'STORE_14', 'CATEGORY_2','400g');
insert into PRODUCT values ('PRODUCT_29', '꽃게 ', '14000','sehwa98.dothome.co.kr/images/PRODUCT_29.jpg', 'STORE_15', 'CATEGORY_2','1kg');
insert into PRODUCT values ('PRODUCT_30', '생굴 ', '15000','sehwa98.dothome.co.kr/images/PRODUCT_30.jpg', 'STORE_15', 'CATEGORY_2','1근');
insert into PRODUCT values ('PRODUCT_31', '오징어 ', '7000','sehwa98.dothome.co.kr/images/PRODUCT_31.jpg', 'STORE_16', 'CATEGORY_2','2개');
insert into PRODUCT values ('PRODUCT_32', '문어 ', '10000','sehwa98.dothome.co.kr/images/PRODUCT_32.jpg', 'STORE_16', 'CATEGORY_2','1팩');
insert into PRODUCT values ('PRODUCT_33', '벌교꼬막', '10000','sehwa98.dothome.co.kr/images/PRODUCT_33.jpg', 'STORE_17', 'CATEGORY_2','3kg');
insert into PRODUCT values ('PRODUCT_34', '홍어무침', '20000','sehwa98.dothome.co.kr/images/PRODUCT_34.jpg', 'STORE_17', 'CATEGORY_2','1kg');
insert into PRODUCT values ('PRODUCT_35', '숙회 ', '10000','sehwa98.dothome.co.kr/images/PRODUCT_35.jpg', 'STORE_18', 'CATEGORY_2','400g');
insert into PRODUCT values ('PRODUCT_36', '갑오징어', '10000','sehwa98.dothome.co.kr/images/PRODUCT_36.jpg', 'STORE_18', 'CATEGORY_2','1개');
insert into PRODUCT values ('PRODUCT_37', '먹갈치', '20000','sehwa98.dothome.co.kr/images/PRODUCT_37.jpg', 'STORE_19', 'CATEGORY_2','3마리');
insert into PRODUCT values ('PRODUCT_38', '동태포', '10000','sehwa98.dothome.co.kr/images/PRODUCT_38.jpg', 'STORE_19', 'CATEGORY_2','1팩');
insert into PRODUCT values ('PRODUCT_39', '자반고등어', '8000','sehwa98.dothome.co.kr/images/PRODUCT_39.jpg', 'STORE_20', 'CATEGORY_2','1개');
insert into PRODUCT values ('PRODUCT_40', '연어 ', '12000','sehwa98.dothome.co.kr/images/PRODUCT_40.jpg', 'STORE_20', 'CATEGORY_2','1팩');

insert into PRODUCT values ('PRODUCT_41', '견과류', '5000','sehwa98.dothome.co.kr/images/PRODUCT_41.PNG', 'STORE_21', 'CATEGORY_3','1되');
insert into PRODUCT values ('PRODUCT_42', '각종멸치류', '5000','sehwa98.dothome.co.kr/images/PRODUCT_42.PNG', 'STORE_21', 'CATEGORY_3','1되');
insert into PRODUCT values ('PRODUCT_43', '광천김자반', '3500','sehwa98.dothome.co.kr/images/PRODUCT_43.PNG', 'STORE_22', 'CATEGORY_3','2봉지');
insert into PRODUCT values ('PRODUCT_44', '7가지견과류', '20000','sehwa98.dothome.co.kr/images/PRODUCT_44.PNG', 'STORE_22', 'CATEGORY_3','1큰되');
insert into PRODUCT values ('PRODUCT_45', '멸치', '5000','sehwa98.dothome.co.kr/images/PRODUCT_45.PNG', 'STORE_23', 'CATEGORY_3','400g');
insert into PRODUCT values ('PRODUCT_46', '땅콩', '2000','sehwa98.dothome.co.kr/images/PRODUCT_46.PNG', 'STORE_23', 'CATEGORY_3','1되');
insert into PRODUCT values ('PRODUCT_47', '구운먹태', '7000','sehwa98.dothome.co.kr/images/PRODUCT_47.PNG', 'STORE_24', 'CATEGORY_3','1팩');
insert into PRODUCT values ('PRODUCT_48', '공주알밤', '5000','sehwa98.dothome.co.kr/images/PRODUCT_48.PNG', 'STORE_24', 'CATEGORY_3','1근');
insert into PRODUCT values ('PRODUCT_49', '노가리', '15000','sehwa98.dothome.co.kr/images/PRODUCT_49.PNG', 'STORE_25', 'CATEGORY_3','400g');
insert into PRODUCT values ('PRODUCT_50', '곱창김', '25000','sehwa98.dothome.co.kr/images/PRODUCT_50.PNG', 'STORE_25', 'CATEGORY_3','1봉지');
insert into PRODUCT values ('PRODUCT_51', '김부각', '13000','sehwa98.dothome.co.kr/images/PRODUCT_51.PNG', 'STORE_26', 'CATEGORY_3','1봉지');
insert into PRODUCT values ('PRODUCT_52', '바삭황태껍질튀삭', '10000','sehwa98.dothome.co.kr/images/PRODUCT_52.PNG', 'STORE_26', 'CATEGORY_3','1봉지');
insert into PRODUCT values ('PRODUCT_53', '곱창돌김', '25000','sehwa98.dothome.co.kr/images/PRODUCT_53.PNG', 'STORE_27', 'CATEGORY_3','1봉지');
insert into PRODUCT values ('PRODUCT_54', '진미채', '10000','sehwa98.dothome.co.kr/images/PRODUCT_54.PNG', 'STORE_27', 'CATEGORY_3','400g');
insert into PRODUCT values ('PRODUCT_55', '볶음자반', '2000','sehwa98.dothome.co.kr/images/PRODUCT_55.PNG', 'STORE_28', 'CATEGORY_3','1봉지');
insert into PRODUCT values ('PRODUCT_56', '파래김', '5000','sehwa98.dothome.co.kr/images/PRODUCT_56.PNG', 'STORE_28', 'CATEGORY_3','1봉지');
insert into PRODUCT values ('PRODUCT_57', '황태채', '10000','sehwa98.dothome.co.kr/images/PRODUCT_57.PNG', 'STORE_29', 'CATEGORY_3','1봉지');
insert into PRODUCT values ('PRODUCT_58', '코다리', '8000','sehwa98.dothome.co.kr/images/PRODUCT_58.PNG', 'STORE_29', 'CATEGORY_3','4마리');
insert into PRODUCT values ('PRODUCT_59', '건새우', '10000','sehwa98.dothome.co.kr/images/PRODUCT_59.PNG', 'STORE_30', 'CATEGORY_3','300g');
insert into PRODUCT values ('PRODUCT_60', '마른황태', '15000','sehwa98.dothome.co.kr/images/PRODUCT_60.PNG', 'STORE_30', 'CATEGORY_3','10마리');

insert into PRODUCT values ('PRODUCT_101', '천혜향', '10000','sehwa98.dothome.co.kr/images/PRODUCT_101.jpg', 'STORE_31', 'CATEGORY_4','5개');
insert into PRODUCT values ('PRODUCT_102', '부사 사과', '10000','sehwa98.dothome.co.kr/images/PRODUCT_102.jpg', 'STORE_31', 'CATEGORY_4','7개');
insert into PRODUCT values ('PRODUCT_103', '꿀딸기', '10000','sehwa98.dothome.co.kr/images/PRODUCT_103.jpg', 'STORE_32', 'CATEGORY_4','1kg');
insert into PRODUCT values ('PRODUCT_104', '홍고추', '2000','sehwa98.dothome.co.kr/images/PRODUCT_104.jpg', 'STORE_32', 'CATEGORY_4','250g');
insert into PRODUCT values ('PRODUCT_105', '시금치', '1500','sehwa98.dothome.co.kr/images/PRODUCT_105.jpg', 'STORE_33', 'CATEGORY_4','1단');
insert into PRODUCT values ('PRODUCT_106', '창원꿀단감', '1500','sehwa98.dothome.co.kr/images/PRODUCT_106.jpg', 'STORE_33', 'CATEGORY_4','1개');
insert into PRODUCT values ('PRODUCT_107', '복숭아', '5000','sehwa98.dothome.co.kr/images/PRODUCT_107.jpg', 'STORE_34', 'CATEGORY_4','1팩');
insert into PRODUCT values ('PRODUCT_108', '오이', '2000','sehwa98.dothome.co.kr/images/PRODUCT_108.jpg', 'STORE_34', 'CATEGORY_4','3개');
insert into PRODUCT values ('PRODUCT_109', '골드 키위', '6000','sehwa98.dothome.co.kr/images/PRODUCT_109.jpg', 'STORE_35', 'CATEGORY_4','1팩');
insert into PRODUCT values ('PRODUCT_110', '자연산 참두릅', '18000','sehwa98.dothome.co.kr/images/PRODUCT_110.jpg', 'STORE_35', 'CATEGORY_4','1근');
insert into PRODUCT values ('PRODUCT_111', '깐 쪽파', '7000','sehwa98.dothome.co.kr/images/PRODUCT_111.jpg', 'STORE_36', 'CATEGORY_4','1단');
insert into PRODUCT values ('PRODUCT_112', '파프리카', '2000','sehwa98.dothome.co.kr/images/PRODUCT_112.jpg', 'STORE_36', 'CATEGORY_4','1개');
insert into PRODUCT values ('PRODUCT_113', '레드향', '30000','sehwa98.dothome.co.kr/images/PRODUCT_113.jpg', 'STORE_37', 'CATEGORY_4','1박스');
insert into PRODUCT values ('PRODUCT_114', '곶감', '8000','sehwa98.dothome.co.kr/images/PRODUCT_114.jpg', 'STORE_37', 'CATEGORY_4','1팩');
insert into PRODUCT values ('PRODUCT_115', '대추방울', '3500','sehwa98.dothome.co.kr/images/PRODUCT_115.jpg', 'STORE_38', 'CATEGORY_4','2근');
insert into PRODUCT values ('PRODUCT_116', '애호박', '2000','sehwa98.dothome.co.kr/images/PRODUCT_116.jpg', 'STORE_38', 'CATEGORY_4','1개');
insert into PRODUCT values ('PRODUCT_117', '성주 참외', '5000','sehwa98.dothome.co.kr/images/PRODUCT_117.jpg', 'STORE_39', 'CATEGORY_4','1바구니');
insert into PRODUCT values ('PRODUCT_118', '제주 무', '1000','sehwa98.dothome.co.kr/images/PRODUCT_118.jpg', 'STORE_39', 'CATEGORY_4','1개');
insert into PRODUCT values ('PRODUCT_119', '가지', '2000','sehwa98.dothome.co.kr/images/PRODUCT_119.jpg', 'STORE_40', 'CATEGORY_4','1봉지');
insert into PRODUCT values ('PRODUCT_120', '고구마', '3000','sehwa98.dothome.co.kr/images/PRODUCT_120.jpg', 'STORE_40', 'CATEGORY_4','1봉지');

insert into PRODUCT values ('PRODUCT_81', '블랙넛츠박스', '28000','sehwa98.dothome.co.kr/images/PRODUCT_81.png', 'STORE_41', 'CATEGORY_5','1박스');
insert into PRODUCT values ('PRODUCT_82', '블랙넛츠낱개', '2000','sehwa98.dothome.co.kr/images/PRODUCT_82.png', 'STORE_41', 'CATEGORY_5','1봉지');
insert into PRODUCT values ('PRODUCT_83', '허니버터아몬드', '14800','sehwa98.dothome.co.kr/images/PRODUCT_83.png', 'STORE_42', 'CATEGORY_5','1박스');
insert into PRODUCT values ('PRODUCT_84', '검은모자호두', '14500','sehwa98.dothome.co.kr/images/PRODUCT_84.png', 'STORE_42', 'CATEGORY_5','1팩');
insert into PRODUCT values ('PRODUCT_85', '검은모자구운아몬드', '16000','sehwa98.dothome.co.kr/images/PRODUCT_85.png', 'STORE_43', 'CATEGORY_5','1팩');
insert into PRODUCT values ('PRODUCT_86', '로스트아몬드', '10000','sehwa98.dothome.co.kr/images/PRODUCT_86.png', 'STORE_43', 'CATEGORY_5','1팩');
insert into PRODUCT values ('PRODUCT_87', '넛츠브라더낱개', '31000','sehwa98.dothome.co.kr/images/PRODUCT_87.png', 'STORE_44', 'CATEGORY_5','1봉지');
insert into PRODUCT values ('PRODUCT_88', '넛츠브라더박스', '3000','sehwa98.dothome.co.kr/images/PRODUCT_88.png', 'STORE_44', 'CATEGORY_5','1박스');
insert into PRODUCT values ('PRODUCT_89', '볶은현미', '7000','sehwa98.dothome.co.kr/images/PRODUCT_89.png', 'STORE_45', 'CATEGORY_5','200g');
insert into PRODUCT values ('PRODUCT_90', '선식', '6000','sehwa98.dothome.co.kr/images/PRODUCT_90.png', 'STORE_45', 'CATEGORY_5','200g');
insert into PRODUCT values ('PRODUCT_91', '브라질너트', '10000','sehwa98.dothome.co.kr/images/PRODUCT_91.png', 'STORE_46', 'CATEGORY_5','1팩');
insert into PRODUCT values ('PRODUCT_92', '형님땅콩', '14000','sehwa98.dothome.co.kr/images/PRODUCT_92.png', 'STORE_46', 'CATEGORY_5','3봉지');
insert into PRODUCT values ('PRODUCT_93', '투데이넛한줌너트', '10000','sehwa98.dothome.co.kr/images/PRODUCT_93.png', 'STORE_47', 'CATEGORY_5','1팩');
insert into PRODUCT values ('PRODUCT_94', '넛톨로지먼투썬', '20000','sehwa98.dothome.co.kr/images/PRODUCT_94.png', 'STORE_47', 'CATEGORY_5','1팩');
insert into PRODUCT values ('PRODUCT_95', '자연루너트한줌', '24000','sehwa98.dothome.co.kr/images/PRODUCT_95.png', 'STORE_48', 'CATEGORY_5','1봉지');
insert into PRODUCT values ('PRODUCT_96', '오트리넛츠', '14000','sehwa98.dothome.co.kr/images/PRODUCT_96.png', 'STORE_48', 'CATEGORY_5','200g');
insert into PRODUCT values ('PRODUCT_97', '투데이넛한줌오리지널', '20000','sehwa98.dothome.co.kr/images/PRODUCT_97.png', 'STORE_49', 'CATEGORY_5','600g');
insert into PRODUCT values ('PRODUCT_98', '참나린햇너츠', '23000','sehwa98.dothome.co.kr/images/PRODUCT_98.png', 'STORE_49', 'CATEGORY_5','1박스');
insert into PRODUCT values ('PRODUCT_99', '곰곰너츠', '12000','sehwa98.dothome.co.kr/images/PRODUCT_99.png', 'STORE_50', 'CATEGORY_5','1팩');
insert into PRODUCT values ('PRODUCT_100', '너츠팜', '30000','sehwa98.dothome.co.kr/images/PRODUCT_100.png', 'STORE_50', 'CATEGORY_5','1팩');

insert into PRODUCT values ('PRODUCT_61', '모듬전', '9000','sehwa98.dothome.co.kr/images/PRODUCT_61.jpg', 'STORE_51', 'CATEGORY_6','1팩');
insert into PRODUCT values ('PRODUCT_62', '돼지껍데기', '10000','sehwa98.dothome.co.kr/images/PRODUCT_62.jpg', 'STORE_51', 'CATEGORY_6','600g');
insert into PRODUCT values ('PRODUCT_63', '수수호떡', '1000','sehwa98.dothome.co.kr/images/PRODUCT_63.jpg', 'STORE_52', 'CATEGORY_6','1개');
insert into PRODUCT values ('PRODUCT_64', '해물부추전', '5000','sehwa98.dothome.co.kr/images/PRODUCT_64.jpg', 'STORE_52', 'CATEGORY_6','1개');
insert into PRODUCT values ('PRODUCT_65', '계란말이', '3000','sehwa98.dothome.co.kr/images/PRODUCT_65.jpg', 'STORE_53', 'CATEGORY_6','1개');
insert into PRODUCT values ('PRODUCT_66', '전', '25000','sehwa98.dothome.co.kr/images/PRODUCT_66.jpg', 'STORE_53', 'CATEGORY_6','1kg');
insert into PRODUCT values ('PRODUCT_67', '고구마', '4000','sehwa98.dothome.co.kr/images/PRODUCT_67.jpg', 'STORE_54', 'CATEGORY_6','1kg');
insert into PRODUCT values ('PRODUCT_68', '군고구마', '4000','sehwa98.dothome.co.kr/images/PRODUCT_68.jpg', 'STORE_54', 'CATEGORY_6','3개');
insert into PRODUCT values ('PRODUCT_69', '편육', '8000','sehwa98.dothome.co.kr/images/PRODUCT_69.jpg', 'STORE_55', 'CATEGORY_6','1인분');
insert into PRODUCT values ('PRODUCT_70', '부대찌개', '8900','sehwa98.dothome.co.kr/images/PRODUCT_70.jpg', 'STORE_55', 'CATEGORY_6','3인분');
insert into PRODUCT values ('PRODUCT_71', '골뱅이쫄면', '11000','sehwa98.dothome.co.kr/images/PRODUCT_71.jpg', 'STORE_56', 'CATEGORY_6','1팩');
insert into PRODUCT values ('PRODUCT_72', '국물닭발', '10000','sehwa98.dothome.co.kr/images/PRODUCT_72.jpg', 'STORE_56', 'CATEGORY_6','500g');
insert into PRODUCT values ('PRODUCT_73', '옛날통닭', '5000','sehwa98.dothome.co.kr/images/PRODUCT_73.jpg', 'STORE_57', 'CATEGORY_6','1마리');
insert into PRODUCT values ('PRODUCT_74', '닭다리날개', '9900','sehwa98.dothome.co.kr/images/PRODUCT_74.jpg', 'STORE_57', 'CATEGORY_6','10개');
insert into PRODUCT values ('PRODUCT_75', '수제돈까스', '1200','sehwa98.dothome.co.kr/images/PRODUCT_75.jpg', 'STORE_58', 'CATEGORY_6','100g');
insert into PRODUCT values ('PRODUCT_76', '새우전', '6000','sehwa98.dothome.co.kr/images/PRODUCT_76.jpg', 'STORE_58', 'CATEGORY_6','7마리');
insert into PRODUCT values ('PRODUCT_77', '마카롱', '2000','sehwa98.dothome.co.kr/images/PRODUCT_77.jpg', 'STORE_59', 'CATEGORY_6','1개');
insert into PRODUCT values ('PRODUCT_78', '머랭쿠키', '3000','sehwa98.dothome.co.kr/images/PRODUCT_78.jpg', 'STORE_59', 'CATEGORY_6','1개');
insert into PRODUCT values ('PRODUCT_79', '진미채', '2000','sehwa98.dothome.co.kr/images/PRODUCT_79.jpg', 'STORE_60', 'CATEGORY_6','1팩');
insert into PRODUCT values ('PRODUCT_80', '혼합견과류', '2000','sehwa98.dothome.co.kr/images/PRODUCT_80.jpg', 'STORE_60', 'CATEGORY_6','1팩');

