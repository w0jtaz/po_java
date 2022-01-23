package pl.edu.uwm.obiektowe.s162436.kolo2;

import java.util.Stack;

public interface IListable {
    Stack<Product> getSortedByValue(boolean ascending);
}
