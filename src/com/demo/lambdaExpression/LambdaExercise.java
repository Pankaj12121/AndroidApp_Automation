package com.demo.lambdaExpression;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import J13.com.demo.collections.ArrayLists.ArraysToList;
import WD14.com.demo.datadriven.ExtractToList;

public class LambdaExercise {
	public static void main(String[] args) {
		Predicate<String> stringLen = (s) -> s.length() < 10;
		System.out.println(stringLen.test("Apples") + "-Apples is less than 10");

		Consumer<String> consumerStr = (s) -> System.out.println(s.toLowerCase());
		consumerStr.accept("ABXCRDwrwrwrKKER");

		Function<Integer, String> converter = (num) -> Integer.toString(num);
		System.out.println("length of 26: " + converter.apply(26).length());

		Supplier<String> S = () -> "Java is fun";
		System.out.println(S.get());

		BinaryOperator<Integer> add = (a, b) -> a + b;
		System.out.println("add 10+25: " + add.apply(10, 25));

		IntFunction<String> intToString = num -> Integer.toString(num);
		System.out.println("expected value 3, actual value: " + intToString.apply(1235464753).length());

		IntFunction<String> intToString2 = Integer::toString;
		System.out.println("expected value 3, actual value: " + intToString.apply(1235464753).length());

		Function<String, BigInteger> newBigInt = BigInteger::new;
		System.out.println("expected value 123456789, actual value : " + newBigInt.apply("123456789"));

		List<String> names = Arrays.asList("pankaj", "Bhagya", "Amogh");

		Collections.sort(names, (a, b) -> b.compareTo(a));
		System.out.println(names);

		Books book1 = new Books("abc", "pankaj", "the god", 600);
		Books book2 = new Books("bbc", "bhagya", "the dieti", 300);
		Books book3 = new Books("bbb", "amogh", "vishnuPuran", 900);

		List<Books> bookCollection = Arrays.asList(book1, book2, book3);
		int total = bookCollection.stream().collect(Collectors.summingInt(Books::getPages));
		System.out.println("total pages in a book: " + total);

		List<String> authors = bookCollection.stream().map(Books::getAuthor).collect(Collectors.toList());
		System.out.println("The Author: " + authors);

		List<String> dups = Arrays.asList("Pankaj", "Pankaj", "Amogh", "Amogh", "bhagya");
		Set<String> dupset = new HashSet<String>(dups);
		dups = dupset.stream().collect(Collectors.toList());
		System.out.println(dups);

		Arrays.asList("Pankaj", "Pankaj", "Amogh", "Amogh", "bhagya").stream().sorted().findFirst()
				.ifPresent(System.out::println);

		IntStream.range(1, 10).forEach(System.out::println);

		Arrays.stream(new int[] { 1, 2, 3, 4 }).map(n -> n * n).average().ifPresent(System.out::println);

		Stream.of(1.5, 3.5, 5.2).mapToInt(Double::intValue).forEach(System.out::println);

	}
}
