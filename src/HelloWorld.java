import org.junit.Test;

final public class HelloWorld {
        private static void sayHello() {
                System.out.println("Hello, world! ");
        }
        
        @Test
        public void test() {
                sayHello();
        }
}
