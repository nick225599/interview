package org.example.jvm.runtime.area;

public class JavaBeanB {
    private String beanName;
    private JavaBeanA javaBeanA;

    public JavaBeanB() {
        beanName = "b";
        javaBeanA = new JavaBeanA();
    }

    public String getBeanName() {
        return this.beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public JavaBeanA getJavaBeanA() {
        return this.javaBeanA;
    }

    public void setJavaBeanA(JavaBeanA javaBeanA) {
        this.javaBeanA = javaBeanA;
    }


}
