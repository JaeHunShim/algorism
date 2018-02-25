package algorism.Easy;

class StringExercise{
    String getMiddle(String word){
		char[] array = word.toCharArray();
		String middle;
		//System.out.println(array.length);
		if(array.length % 2 == 0) {
			String middle1;
			String middle2;
			middle1 = String.valueOf(array[(array.length/2)-1]);
			middle2 = String.valueOf(array[array.length/2]);
			
			middle = middle1.concat(middle2);
			//System.out.println(middle);
			
		}else {
			middle = String.valueOf(array[(array.length/2)]);
			//System.out.println(middle);
		}
    	return middle;    
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}