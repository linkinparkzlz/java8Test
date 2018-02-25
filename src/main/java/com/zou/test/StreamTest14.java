package com.zou.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*

1.  collect :搜集器
2.  Collector作为ollect()方法的参数
3.  Collector是一个接口,它是一个汇聚操作，将输入元素累积到一个可变的结果容器中；
    它会在所有的元素都处理完毕之后，将累积的结果转换为一个最终的表示。支持串行和并行两种方式执行。

4.Clooectors本身提供了关于Collector的常见汇聚实现，Collectors本身实际上是一个工厂。




 */

public class StreamTest14 {


    public static void main(String[] args) {


        Student student1 = new Student("zhangsan", 100, 20);
        Student student2 = new Student("lisi", 90, 30);
        Student student3 = new Student("wangwu", 146, 20);
        Student student4 = new Student("zhaoliu", 199, 50);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);

        List<Student> students1 = students.stream().collect(Collectors.toList());
        students1.forEach(System.out::println);

        System.out.println("count :" + students.stream().collect(Collectors.counting()));

        System.out.println("count :" + students.stream().count());


    }
}

/**
 * A <a href="package-summary.html#Reduction">mutable reduction operation</a> that
 * accumulates input elements into a mutable result container, optionally transforming
 * the accumulated result into a final representation after all input elements
 * have been processed.  Reduction operations can be performed either sequentially
 * or in parallel.
 * <p>
 * <p>
 * <p>A {@code Collector} is specified by four functions that work together to
 * accumulate entries into a mutable result container, and optionally perform
 * a final transform on the result.  They are: <ul>
 * <li>creation of a new result container ({@link #supplier()})</li>   用于创建结果容器
 * <li>incorporating a new data element into a result container ({@link #accumulator()})</li>   将新的数据元素累加到结果容器中
 * <li>combining two result containers into one ({@link #combiner()})</li>  将部分结果合并为一个结果
 * <li>performing an optional final transform on the container ({@link #finisher()})</li>   将累积类型转换为结果类型
 * </ul>
 * <p>
 * <p>
 * 同一性和结合性
 * * <p>To ensure that sequential and parallel executions produce equivalent
 * results, the collector functions must satisfy an <em>identity</em> and an
 * <a href="package-summary.html#Associativity">associativity</a> constraints.
 */


/**
 <p>A {@code Collector} is specified by four functions that work together to
 * accumulate entries into a mutable result container, and optionally perform
 * a final transform on the result.  They are: <ul>
 <li>creation of a new result container ({@link #supplier()})</li>   用于创建结果容器
 *     <li>incorporating a new data element into a result container ({@link #accumulator()})</li>   将新的数据元素累加到结果容器中
 *     <li>combining two result containers into one ({@link #combiner()})</li>  将部分结果合并为一个结果
 *     <li>performing an optional final transform on the container ({@link #finisher()})</li>   将累积类型转换为结果类型
 * </ul>
 *
 *
 * 同一性和结合性
 *  * <p>To ensure that sequential and parallel executions produce equivalent
 * results, the collector functions must satisfy an <em>identity</em> and an
 * <a href="package-summary.html#Associativity">associativity</a> constraints.
 */




 /* <pre>{@code
 *     A a1 = supplier.get();
         *     accumulator.accept(a1, t1);
         *     accumulator.accept(a1, t2);
         *     R r1 = finisher.apply(a1);  // result without splitting
         *
         *     A a2 = supplier.get();
         *     accumulator.accept(a2, t1);
         *     A a3 = supplier.get();
         *     accumulator.accept(a3, t2);
         *     R r2 = finisher.apply(combiner.apply(a2, a3));  // result with splitting
         * } </pre>
         *
         *
         *
         *  * <pre>{@code
 *          Collector<Widget, ?, TreeSet<Widget>> intoSet =
 *         Collector.of(TreeSet::new, TreeSet::add,
 *                      (left, right) -> { left.addAll(right); return left; });
 * }</pre>
*/

// combiner函数，有四个线程同时去执行，那么就会生成4个部分结果。

//为了确保串行与并行操作结果的等价性，Collector函数需要满足两个条件：identity（同一性） 与associativity（结合性）



































