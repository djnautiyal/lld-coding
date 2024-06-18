package com.learn.design_patterns.behavioural.interpreter.binary_expression_interpreter;

public class Interpreter {
    public static void main(String[] args) {
        Context context = new Context();
        context.setValue("a", 2);
        context.setValue("b", 3);
        context.setValue("c", 4);
        context.setValue("d", 5);

        //a+b
        Expression sumExpression = new AddExpression(new NumberExpression("a"), new NumberExpression("b"));
        System.out.println("a+b=" + sumExpression.interpret(context));

        //c*d
        Expression multiplyExpression = new MultiplyExpression(new NumberExpression("c"), new NumberExpression("d"));
        System.out.println("c*d=" + multiplyExpression.interpret(context));

        //(a*b)+(c*d)
        Expression complexExpression = new AddExpression(
                new MultiplyExpression(new NumberExpression("a"), new NumberExpression("b")),
                new MultiplyExpression(new NumberExpression("c"), new NumberExpression("d")));
        System.out.println("(a*b)+(c*d)=" + complexExpression.interpret(context));

        //(a*c)+(b*d)
        Expression complexExpression2 = new BinaryExpression(
                new BinaryExpression(new NumberExpression("a"), '*',new NumberExpression("c")),
                '+',
                new BinaryExpression(new NumberExpression("b"), '*',new NumberExpression("d")));
        System.out.println("(a*c)+(b*d)=" + complexExpression2.interpret(context));
    }
}
