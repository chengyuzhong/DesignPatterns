import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Main {

    private static class Student{
        private String name;
        private String age;
        private String address;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Student(String name, String age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }

        //
    }
    private static Integer calc(BinaryOperator<Integer> fun,Integer a,Integer b){
        return fun.apply(a,b);
    }


    private static Integer test(MathTest mathTest,Integer x,Integer y){
        return mathTest.calculus(x,y);
    }


    public static void main(String[] args) {
	// write your code here

        Student zhang = new Student("zhang", "30", "jiu");

        Student zhao = new Student("zhao", "28", "jiu2");
        Student zhou = new Student("zhou", "49", "jiu3");
        List<Student> students = Arrays.asList(zhang, zhao, zhou);
        //y=f（x）  =>y =f.apply(x)
//         students.stream().map(x -> x.getName()).collect(Collectors.toList()).forEach(System.out::println);

//         students.stream().filter(aaaa -> Integer.parseInt(aaaa.getAge())>29).collect(Collectors.toList()).forEach(System.out::println);

        Integer add = calc((x, y) -> x + y, 1, 3);
        Integer subtract= calc((x, y) -> x - y, 1, 3);
        System.out.println(String.format("1+3=%s, 1-3=%s",add,subtract));
        BinaryOperator<Integer> f=(x,y) -> x+y;
        UnaryOperator<Integer> g =(x) -> x+2;


        Integer test = test((x, y) -> x * y, 1, 5);
        System.out.println(test);
    }


}
