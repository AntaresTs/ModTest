package com.example.examplemod.test;

import com.example.examplemod.ExampleMod;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;


public class Gui extends GuiScreen {

    public void initGui() {
        this.buttonList.clear();

        this.buttonList.add(new GuiButton(1, 100, 100, I18n.format("Button.Name", new Object[0]))); //�� ������ �� ���� ������ ��������, ������������ ��  x, y, ��������

    }

    protected void actionPerformed(GuiButton button) {
        switch (button.id)
        {
            case 1:
                //�������� �� ������� �� ������ � �� 1
        }
    }


    public void drawScreen(int a, int b, float c) {
        super.drawScreen(a, b, c); //������������
    }
}