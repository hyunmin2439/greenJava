package com.green;

import java.util.Arrays;

// 정수 배열 정렬 알고리즘
class IntArraySort {

	public static void display(int[] arr) {
		for(int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println("\n");
	}
	
	// 모든 sort Algorithm은 오름차순 기준
	
	// 제일 큰 값이 제일 오른쪽에 놓인다.
	public static void bubbleSort(int[] arr) {
		int tmp, n = arr.length;
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}

	// 제일 왼쪽 부터 점점 정렬해 나가는 것.
	public static void insertionSort(int[] arr) {
		int tmp, n = arr.length;
		
		for (int i = 0; i < n; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j - 1] > arr[j]) {
					tmp 		= arr[j];
					arr[j] 		= arr[j - 1];
					arr[j - 1] 	= tmp;
				}
			}
		}
	}

	// 가장 낮은 값을 선택하여 제일 왼쪽에 두는 것.
	public static void selectionSort(int[] arr) {
		int idx, tmp, n = arr.length;
		
		for (int i = 0; i < n; i++) {
			idx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[idx])
					idx = j;
			}

			tmp 	 = arr[i];
			arr[i] 	 = arr[idx];
			arr[idx] = tmp;
		}
	}
	
	// dual-pivot quick sort : 동작원리 찾아볼것
	public static void arraysSort(int[] arr) {
		Arrays.sort(arr);
	}
}


//문자열 배열 정렬 알고리즘
class StringArraySort {

	public static void display(String[] strArr) {
		for(String str : strArr) {
			System.out.print(str + " ");
		}
		System.out.println("\n");
	}

	
	public static void bubbleSort(String[] strArr) {
		int n = strArr.length;
		String tmp;
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - 1 - i; j++) {
				if(strArr[j].compareTo(strArr[j + 1]) > 0) {
					tmp 		  = strArr[j];
					strArr[j] 	  = strArr[j + 1];
					strArr[j + 1] = tmp;
				}
			}
		}
	}
	
}

class Student {
	// field
	String 	name;
	String 	tel;
	int 	inYear;
	
	public Student() { }
	
	public Student(String name, String tel, int inYear) {
		this.name = name;
		this.tel = tel;
		this.inYear = inYear;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", tel=" + tel + ", inYear=" + inYear + "]";
	}
	
//	여기에 정렬 메서드를 넣으면 문제 없이 동작 한다. 
//	하지만 업무적으로 일을 나눠서 생각하자는 것.
//	Student Class는 학생의 한명의 정보를 가지고 저장을 하여 사용하고 있다.
//	하지만 bubbleSort의 경우 학생 여러명의 정보를 가지고 정렬하는 메소드이다.
//	Student 안에 넣어서 동작을 하지만 bubbleSort 자체가 학생 여러명의 정보를 다룬다.
//	때문에 업무적으로 헷갈릴 수도 있기 때문에 따로 class로 만들어서 빼는 것이 좋다.
	
//	즉 결론은 틀린 방식은 아니지만 관습적으로 좋지 못한 방식
	
//	public static void bubbleSort(Student[] stud) {
//		int n = stud.length;
//		Student tmp;
//		
//		for(int i = 0; i < n - 1; i++) {
//			for(int j = 0; j < n - 1 - i; j++) {
//				if(stud[j].inYear > stud[j + 1].inYear) {
//					tmp	= stud[j];
//					stud[j] = stud[j + 1];
//					stud[j + 1] = tmp;
//				}
//			}
//		}
//	}
}

// 객체 배열 정렬 클래스
class StudentArraySort {
	
	public static void display(Student[] stud) {
		for(Student st : stud) {
			System.out.println(st);
		}
		
	}

	public static void bubbleSort(Student[] stud, int op) {
		int n = stud.length;
		Student tmp;
		boolean check = false;
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - 1 - i; j++) {
				switch(op) {
				case 1: // name
					check = stud[j].name.compareTo(stud[j+1].name) > 0;
					break;
					
				case 2: // tel
					check = stud[j].tel.compareTo(stud[j+1].tel) > 0;
					break;
					
				case 3: // inYear
					check = stud[j].inYear > stud[j + 1].inYear;
					break;
				}
				
				if(check) {
					tmp	= stud[j];
					stud[j] = stud[j + 1];
					stud[j + 1] = tmp;
				}
			}
		}
	}
	
}

public class ClassSortTest {

	public static void main(String[] args) {
		// 숫자, 문자열 비교 (순서) : sort
		
		/******************* Int Array ***********************/
//		int[] arr = { 8, 3, 9, 7, 2 };
//		IntArraySort.display(arr);
		
//		System.out.println("BubbleSort");
//		IntArraySort.bubbleSort( arr );
//		IntArraySort.display(arr);
		
//		
//		System.out.println("InsertionSort");
//		IntArraySort.insertionSort( arr );
//		IntArraySort.display(arr);
//
//		System.out.println("SelectionSort");
//		IntArraySort.selectionSort( arr );
//		IntArraySort.display(arr);
		
//		IntArraySort.arraysSort(arr);
//		IntArraySort.display(arr);
		
		
		/******************* String Array ***********************/
//		String[] strArr = new String[] {
//			"이순신", "이이", "세종", "박문수", "방원이"	
//		};
//		StringArraySort.display(strArr);
//		StringArraySort.bubbleSort(strArr);
//		StringArraySort.display(strArr);
		
		
		
		/******************* Object Array ***********************/
		// 객체는 어떻게 비교해서 어떻게 자리를 바꿀 것이냐?
		Student[] stud = new Student[] {
				new Student("이순신", "010-1111-2323", 2009),
				new Student("이이", "010-3232-2323", 2004),
				new Student("세종", "010-7878-8843", 2002),
				new Student("홍길동", "010-2222-2323", 2011),
				new Student("강감찬", "010-1111-1111", 2005)
		};
		
		System.out.println("=========================");
		
		System.out.println("정렬전");
		StudentArraySort.display( stud ); // Student [] 출력
		
		System.out.println("\n이름순 정렬");
		int op = 1; // op : 1 - 이름, 2 - 전화, 3 - 입학년도 
		StudentArraySort.bubbleSort( stud, op ); // Student [] 정렬
		
		StudentArraySort.display( stud ); // Student [] 출력
		
		
		System.out.println("\n전화번호순 정렬");
		
		op = 2; // op : 1 - 이름, 2 - 전화, 3 - 입학년도 
		StudentArraySort.bubbleSort( stud, op ); // Student [] 정렬
		
		StudentArraySort.display( stud ); // Student [] 출력
		
		
		System.out.println("\n입학년도순 정렬");
		op = 3; // op : 1 - 이름, 2 - 전화, 3 - 입학년도 
		StudentArraySort.bubbleSort( stud, op ); // Student [] 정렬
		
		StudentArraySort.display( stud ); // Student [] 출력
		
	}
	
	
}
