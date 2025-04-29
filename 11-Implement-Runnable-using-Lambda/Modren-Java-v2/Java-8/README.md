![
    Runnable Interface
](image.png)

```
https://www.geeksforgeeks.org/java-functional-interfaces/


```

package java.lang
@FunctionalInterface. // annotation 
public Interface Runnable {
    void run();
}

```

![
    


](image-3.png)


### Extracted Text:

**Lambdas vs Legacy Java (until Java 7)**

#### **Legacy:**
```java
Runnable runnable = new Runnable() {
    @Override
    public void run() {
        System.out.println("Inside Runnable 1");
    }
};
```

#### **Java 8:**
```java
Runnable runnableLambda = () -> { System.out.println("Inside Runnable 2"); };
```