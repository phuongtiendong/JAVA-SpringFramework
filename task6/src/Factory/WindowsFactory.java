package Factory;

public class WindowsFactory implements Factory{
    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
