package casting;

import java.security.DrbgParameters.NextBytes;

//넷플릭스
//에니메이션, 영화, 드라마 클래스 선언
//사용자가 선택한 영상이
//애니메이션이라면 "자막 지원" 기능 사용
//영화라면 "4D" 기능 사용
//드라마라면 "굿즈" 기능 사용


public class CastingTask {
	public void checkVideo(Netflix netflix) {
		if(netflix instanceof Drama) {
			((Drama) netflix).goods();
		}
		else if(netflix instanceof Film) {
			((Film) netflix).fourD();
		}
		else if(netflix instanceof Animation) {
			((Animation) netflix).subtitles();
		}
	}
	
	public static void main(String[] args) {
		CastingTask castingTask = new CastingTask();
		Netflix[] netflix = {
				new Drama(),
				new Film(),
				new Animation()
		};
		
		
		for (int i = 0; i < netflix.length; i++) {
			castingTask.checkVideo(netflix[i]);
		}
	}
}
