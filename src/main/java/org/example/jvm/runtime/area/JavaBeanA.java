package org.example.jvm.runtime.area;

public class JavaBeanA {
    private String beanName;
    private JavaBeanB javaBeanB;

    public JavaBeanA() {
//        beanName = "a";
//        javaBeanB = new JavaBeanB();
    }

    public String getBeanName() {
        return this.beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public JavaBeanB getJavaBeanB() {
        return this.javaBeanB;
    }

    public void setJavaBeanB(JavaBeanB javaBeanB) {
        this.javaBeanB = javaBeanB;
    }

    @Override
    public String toString() {
//        return null;
        return "JavaBeanA{" + this + "}";
    }
}
