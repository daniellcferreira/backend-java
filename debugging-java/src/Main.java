public class Main {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Iniciou do programa no metodo main");
        a();
        System.out.println("Finalizou do programa do metodo main");

    }

    public static void a() {

        System.out.println("Entrou no metodo a");
        b();
        System.out.println("Finalizou o metodo a");

    }

    public static void b() {

        System.out.println("Entrou no metodo b");
        for(int i = 0; i <= 4; i ++) System.out.println(i);
        c();
        System.out.println("Finalizou o metodo b");
    }

    public static void c() {

        System.out.println("Entrou no metodo c");
        Thread.dumpStack();
        System.out.println("Finalizou o metodo c");
    }
}
