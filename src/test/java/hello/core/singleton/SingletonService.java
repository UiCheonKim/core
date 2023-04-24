package hello.core.singleton;

public class SingletonService {

    // 1. static 영역에 객체를 딱 1개만 생성해둔다.
    // 자기 자신을 내부의 private로 하나 가지고 있는데 static으로 가지고 있는다
    // -> 이렇게 하면 클래스 레벨에 올라가기 때문에 딱 하나만 존재하게 된다
    private static final SingletonService instance = new SingletonService();

    // 2. public 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회하도록 허용한다.
    // 실행하게 되면 static 영역에 new라고 되어 있네
    // 자기가 내부적으로 실행하게 되어 자기 자신을 생성해서 instance 참조해서 넣어 놓는다.
    public static SingletonService getInstance() {
        return instance;
    }

    // 3. 생성자를 private으로 선언해서 외부에서 new 키워드를 사용한 객체 생성을 못하게 막는다.
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }


}
