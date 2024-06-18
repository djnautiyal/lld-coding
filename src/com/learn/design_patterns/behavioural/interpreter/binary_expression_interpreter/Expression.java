package com.learn.design_patterns.behavioural.interpreter.binary_expression_interpreter;

public interface Expression {
    int interpret(Context context);
}

class NumberExpression implements Expression {
    String string;

    NumberExpression(String string) {
        this.string = string;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(string);
    }
}

class MultiplyExpression implements Expression {
    Expression left;
    Expression right;

    MultiplyExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) * right.interpret(context);
    }
}

class AddExpression implements Expression {
    Expression left;
    Expression right;

    AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}

class BinaryExpression implements Expression {
    Expression left;
    Expression right;
    char op;

    BinaryExpression(Expression left, char op, Expression right) {
        this.left = left;
        this.op = op;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return switch (op) {
            case '+' -> left.interpret(context) + right.interpret(context);
            case '-' -> left.interpret(context) - right.interpret(context);
            case '*' -> left.interpret(context) * right.interpret(context);
            case '/' -> left.interpret(context) / right.interpret(context);
            default -> 0;
        };
    }
}
