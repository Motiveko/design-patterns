package com.designpatterns.prototypepatterns.game;

public abstract class Beast implements Prototype{

	public Beast() {
		
	}
	
	public Beast(Beast source) {
		
	}
	
	@Override
	public abstract Beast copy();

	@Override
	public boolean equals(Object obj) {
		if( this == obj) return true;
		else if(obj==null) return false;
		
		//getClass하면 위에 패키지 위치처럼 클래스 위치가 나온다.
		//prototype이기때문에 어차피 class는 주소만 다르고 값은 같은걸 계속 복사하기때문에 클래스 비교로도 가능하다!
		return getClass() == obj.getClass();
	}

	
	
}
