package com.tnsif.daytwentyone;

import java.lang.annotation.Annotation;


@MyCustomAnnotation(greet="Good Afternoon")
//@MyCustomAnnotation()
public class UsingAnnotations {

	public static void main(String[] args) {
		UsingAnnotations obj=new UsingAnnotations();
	
		Annotation an=obj.getClass().getAnnotation(MyCustomAnnotation.class);
		MyCustomAnnotation m=(MyCustomAnnotation) an;
		System.out.println(m.greet());
	}
    
}
