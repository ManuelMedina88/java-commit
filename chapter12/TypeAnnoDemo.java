package chapter12;

// Demonstrate several type annotations.
import java.lang.annotation.*;
import java.lang.reflect.*;

// A marker annotation that can be applied to a type.
@Target(ElementType.TYPE_USE)
@interface TypeAnno{}

// Another marker annotation that can be applied to a type.
@Target (ElementType.TYPE_USE)
@interface NotZeroLen {
}

// Still another marker annotation that can be applied to a type.
@Target(ElementType.TYPE_USE)
@interface Unique{}

// A parameterized annotation that can be applied to a type.
@Target (ElementType.TYPE_USE)
@interface MaxLen {
   int value();
}

// An annotation that can be  applied to a type parameter.
@Target(ElementType.TYPE_PARAMETER)
@interface What {
  String description();
}

// An annotation that can be applied to a field declaration.
@Target(ElementType.FIELD)
@interface EmptyOK {}

// An annotation that can be applied to a method declaration.
@Target(ElementType.METHOD)
@interface Recommended {}

// Use an annotation on a type parameter.
class TypeAnnoDemo<@What (description = "Generic data type") T> {

  // use a type annotation on a constructor.
  public @Unique TypeAnnoDemo(){}

  // Annotate the type (in this case String), not the field.
  @TypeAnno String star;
  
}
