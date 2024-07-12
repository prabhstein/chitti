package com.example.application.views.chatbot;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Chat bot")
@Route(value = "", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class ChatbotView extends Composite<VerticalLayout> {

    public ChatbotView() {
        TextField textField = new TextField();
        Button buttonPrimary = new Button();
        TextField textField2 = new TextField();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        textField.setLabel("Ask me anything!");
        textField.setWidth("min-content");
        buttonPrimary.setText("Submit");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        textField2.setLabel("Response");
        textField2.setWidth("min-content");
        getContent().add(textField);
        getContent().add(buttonPrimary);
        getContent().add(textField2);
    }
}
