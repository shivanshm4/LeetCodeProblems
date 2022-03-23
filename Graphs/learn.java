package Graphs;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

// class Person {

//     private String firstName;
//     private String lastName;

//     public Person(String fn, String In) {
//         this.firstName = fn;
//         this.lastName = In;

//     }

//     public void setFirstName(String fn) {
//         this.firstName = fn;
//     }

//     public String getFirstName() {
//         return this.firstName;

//     }

//     public void setLastName(String In) {
//         this.lastName = In;

//     }

//     public String getLastName() {
//         return this.lastName;
//     }

//     public int hashCode() {

//         return 13;
//     }

//     public String toString() {

//         return "First Name:" + this.firstName + ", Last Name:" + this.lastName;
//     }

//     public static void main(String... args) {

//         Person p1 = new Person("firstName1", "lastName1");
//         Person p2 = new Person("firstName2", "lastName2");
//         Map<Person, String> map = new HashMap<>();

//         map.put(p1, "This is First person Object");
//         map.put(p2, "This is Second person Object");
//         map.put(new Person("firstName1", "astName1"), "Overriding First person Object");
//         System.out.println(map.size());
//         System.out.println(map.get(new Person("firstName1", "lastName1")));
//     }
// }

import java.util.stream.Stream;

class SampleTest {

public static void main(String[] args) {

Integer[] arr = new Integer[] { 10, 3, 10, 2, 20};  
List<Integer> list= Arrays.asList(arr);
OptionalDouble avg =list.stream().mapToInt(n-> n*n).filter (n->n>= 10).average();
if (avg.isPresent ()) System.out.println(avg.getAsDouble());
}
}