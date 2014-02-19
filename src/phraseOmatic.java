
public class phraseOmatic {
	public static void main(String[] args) {
		// 세 종류의 단어 목록 만들기 
		String[] wordListOne = {"woono", "ming", "sallygle", "sang-gwun-i", "jen", "gee", "junggang", "mungchunghajeong", "che-woni", "timin", "park-so"};
		String[] wordListTwo = {"학교", "포커리", "한컴", "공원", "영화관", "노래방", "마트", "prompt", "recover", "교수실", "박물관", "미술관", "콘서트", "극장", "steam1", "쉐프의무국", "스포짐"};
		String[] wordListThree = {"노래하기", "사용하기 도전", "운동", "프로젝트", "식사", "경험", "구입", "욕망", "데이트", "알수없음", "싸우기", "달리기", "운동", "인사"};
		
		// 각 단어 목록에 단어가 몇개 있나 알아봄
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		// 난수 3개 발생시킴
		int rand1 = (int)(Math.random() * oneLength);
		int rand2 = (int)(Math.random() * twoLength);
		int rand3 = (int)(Math.random() * threeLength);
		
		// Math.random()의 범위는 0.0 <= rand < 1.0
		
		// 구문 만듦 
		String phrase = wordListOne[rand1] + "가 " + wordListTwo[rand2] + "에서 " + wordListThree[rand3] + "을(를)하기!";
		
		// 구문 출력
		System.out.println("We want!! " + phrase);
	}
}
