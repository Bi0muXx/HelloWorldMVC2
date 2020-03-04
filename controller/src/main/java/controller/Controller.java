package controller;

import model.IModel;
import model.Model;
import view.IView;
import view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model modelParam, View viewParam) {
        model = modelParam;
        view = viewParam;
    }

    public void run() {
        view.display(model.getMessage());
    }
}
