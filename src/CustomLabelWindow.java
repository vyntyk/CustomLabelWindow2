import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class CustomLabelWindow {

    public static void main(String[] args) {
        // Создаем главное окно
        JFrame frame = new JFrame("Мое окно");
        frame.setSize(800, 600); // Устанавливаем размер окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Создаем JLabel с текстом
        JLabel label = new JLabel("Моя первая надпись!", SwingConstants.CENTER);

        // Устанавливаем начальный шрифт JLabel
        Font initialFont = new Font("Serif", Font.ITALIC, 50);
        label.setFont(initialFont);

        // Добавляем JLabel в центр окна
        frame.add(label, BorderLayout.CENTER);

        // Создаем слайдер
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 5, 100, 50);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        // Добавляем слушателя для слайдера
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int fontSize = slider.getValue();
                Font newFont = new Font("Serif", Font.ITALIC, fontSize);
                label.setFont(newFont);
            }
        });

        // Добавляем слайдер в нижнюю часть окна
        frame.add(slider, BorderLayout.SOUTH);

        // Устанавливаем расположение окна по центру экрана
        frame.setLocationRelativeTo(null);

        // Делаем окно видимым
        frame.setVisible(true);
    }
}
