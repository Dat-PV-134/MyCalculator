package com.rekoj134.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.rekoj134.calculator.databinding.ActivityMainBinding;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    String process;
    char calculationSign;
    double number1, number2, result, count = 0;
    boolean isCalculate = false, isResult = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        try {
            Objects.requireNonNull(this.getSupportActionBar()).hide();
        } catch (NullPointerException ignored) {
        }

        onClickButton();
    }

    @SuppressLint({"SetTextI18n", "UseCompatLoadingForColorStateLists"})
    private void onClickButton() {
        binding.btnAC.setOnClickListener(view -> {
            process = "0";
            binding.tvResult.setText(process);
        });

        binding.btn0.setOnClickListener(view -> {
            process = binding.tvResult.getText().toString();
            if (isCalculate) {
                if (count == 0) {
                    if (process.contains(",")) {
                        process = process.replace(',', '.');
                    }
                    number1 = Double.parseDouble(process);
                    count = 1;
                }
                binding.tvResult.setText("0");
                isCalculate = false;
                signButtonProcess('@');
                return;
            }
            if (process.charAt(0) == '0' && process.length() == 1) {
                binding.tvResult.setText(process);
            } else binding.tvResult.setText(process + "0");
            isRestart(isResult, "0");
        });

        binding.btn1.setOnClickListener(view -> {
            process = binding.tvResult.getText().toString();
            if (isCalculate) {
                if (count == 0) {
                    if (process.contains(",")) {
                        process = process.replace(',', '.');
                    }
                    number1 = Double.parseDouble(process);
                    count = 1;
                }
                binding.tvResult.setText("1");
                isCalculate = false;
                signButtonProcess('@');
                return;
            }
            if (process.charAt(0) == '0' && process.length() == 1) {
                process = process + "1";
                process = process.substring(1);
                binding.tvResult.setText(process);
            } else {
                binding.tvResult.setText(process + "1");
            }
            isRestart(isResult, "1");
        });

        binding.btn2.setOnClickListener(view -> {
            process = binding.tvResult.getText().toString();
            if (isCalculate) {
                if (count == 0) {
                    if (process.contains(",")) {
                        process = process.replace(',', '.');
                    }
                    number1 = Double.parseDouble(process);
                    count = 1;
                }
                binding.tvResult.setText("2");
                isCalculate = false;
                signButtonProcess('@');
                return;
            }
            if (process.charAt(0) == '0' && process.length() == 1) {
                process = process + "2";
                process = process.substring(1);
                binding.tvResult.setText(process);
            } else {
                binding.tvResult.setText(process + "2");
            }
            isRestart(isResult, "2");
        });

        binding.btn3.setOnClickListener(view -> {
            process = binding.tvResult.getText().toString();
            if (isCalculate) {
                if (count == 0) {
                    if (process.contains(",")) {
                        process = process.replace(',', '.');
                    }
                    number1 = Double.parseDouble(process);
                    count = 1;
                }
                binding.tvResult.setText("3");
                isCalculate = false;
                signButtonProcess('@');
                return;
            }
            if (process.charAt(0) == '0' && process.length() == 1) {
                process = process + "3";
                process = process.substring(1);
                binding.tvResult.setText(process);
            } else {
                binding.tvResult.setText(process + "3");
            }
            isRestart(isResult, "3");
        });

        binding.btn4.setOnClickListener(view -> {
            process = binding.tvResult.getText().toString();
            if (isCalculate) {
                if (count == 0) {
                    if (process.contains(",")) {
                        process = process.replace(',', '.');
                    }
                    number1 = Double.parseDouble(process);
                    count = 1;
                }
                binding.tvResult.setText("4");
                isCalculate = false;
                signButtonProcess('@');
                return;
            }
            if (process.charAt(0) == '0' && process.length() == 1) {
                process = process + "4";
                process = process.substring(1);
                binding.tvResult.setText(process);
            } else {
                binding.tvResult.setText(process + "4");
            }
            isRestart(isResult, "4");
        });

        binding.btn5.setOnClickListener(view -> {
            process = binding.tvResult.getText().toString();
            if (isCalculate) {
                if (count == 0) {
                    if (process.contains(",")) {
                        process = process.replace(',', '.');
                    }
                    number1 = Double.parseDouble(process);
                    count = 1;
                }
                binding.tvResult.setText("5");
                isCalculate = false;
                signButtonProcess('@');
                return;
            }
            if (process.charAt(0) == '0' && process.length() == 1) {
                process = process + "5";
                process = process.substring(1);
                binding.tvResult.setText(process);
            } else {
                binding.tvResult.setText(process + "5");
            }
            isRestart(isResult, "5");
        });

        binding.btn6.setOnClickListener(view -> {
            process = binding.tvResult.getText().toString();
            if (isCalculate) {
                if (count == 0) {
                    if (process.contains(",")) {
                        process = process.replace(',', '.');
                    }
                    number1 = Double.parseDouble(process);
                    count = 1;
                }
                binding.tvResult.setText("6");
                isCalculate = false;
                signButtonProcess('@');
                return;
            }
            if (process.charAt(0) == '0' && process.length() == 1) {
                process = process + "6";
                process = process.substring(1);
                binding.tvResult.setText(process);
            } else {
                binding.tvResult.setText(process + "6");
            }
            isRestart(isResult, "6");
        });

        binding.btn7.setOnClickListener(view -> {
            process = binding.tvResult.getText().toString();
            if (isCalculate) {
                if (count == 0) {
                    if (process.contains(",")) {
                        process = process.replace(',', '.');
                    }
                    number1 = Double.parseDouble(process);
                    count = 1;
                }
                binding.tvResult.setText("7");
                isCalculate = false;
                signButtonProcess('@');
                return;
            }
            if (process.charAt(0) == '0' && process.length() == 1) {
                process = process + "7";
                process = process.substring(1);
                binding.tvResult.setText(process);
            } else {
                binding.tvResult.setText(process + "7");
            }
            isRestart(isResult, "7");
        });

        binding.btn8.setOnClickListener(view -> {
            process = binding.tvResult.getText().toString();
            if (isCalculate) {
                if (count == 0) {
                    if (process.contains(",")) {
                        process = process.replace(',', '.');
                    }
                    number1 = Double.parseDouble(process);
                    count = 1;
                }
                binding.tvResult.setText("8");
                isCalculate = false;
                signButtonProcess('@');
                return;
            }
            if (process.charAt(0) == '0' && process.length() == 1) {
                process = process + "8";
                process = process.substring(1);
                binding.tvResult.setText(process);
            } else {
                binding.tvResult.setText(process + "8");
            }
            isRestart(isResult, "8");
        });

        binding.btn9.setOnClickListener(view -> {
            process = binding.tvResult.getText().toString();
            if (isCalculate) {
                if (count == 0) {
                    if (process.contains(",")) {
                        process = process.replace(',', '.');
                    }
                    number1 = Double.parseDouble(process);
                    count = 1;
                }
                binding.tvResult.setText("9");
                isCalculate = false;
                signButtonProcess('@');
                return;
            }
            if (process.charAt(0) == '0' && process.length() == 1) {
                process = process + "9";
                process = process.substring(1);
                binding.tvResult.setText(process);
            } else {
                binding.tvResult.setText(process + "9");
            }
            isRestart(isResult, "9");
        });

        binding.btnChangeMathSign.setOnClickListener(view -> {
            process = binding.tvResult.getText().toString();
            if (process.charAt(0) == '-') {
                process = process.substring(1);
                binding.tvResult.setText(process);
            } else {
                binding.tvResult.setText("-" + process);
            }
        });

        binding.btnComma.setOnClickListener(view -> {
            process = binding.tvResult.getText().toString();
            if (process.contains(",")) {
                binding.tvResult.setText(process);
            } else {
                binding.tvResult.setText(process + ",");
            }
        });

        binding.btnPlus.setOnClickListener(view -> {
            if (isCalculate && calculationSign == '+') {
                binding.btnPlus.setBackgroundTintList(getResources().getColorStateList(R.color.unclick_sign_button));
                binding.btnPlus.setTextColor(getResources().getColor(R.color.white));
                isCalculate = false;
            } else {
                isCalculate = true;
                calculationSign = '+';
                signButtonProcess(calculationSign);
            }
        });

        binding.btnMinus.setOnClickListener(view -> {
            if (isCalculate && calculationSign == '-') {
                binding.btnMinus.setBackgroundTintList(getResources().getColorStateList(R.color.unclick_sign_button));
                binding.btnMinus.setTextColor(getResources().getColor(R.color.white));
                isCalculate = false;
            } else {
                isCalculate = true;
                calculationSign = '-';
                signButtonProcess(calculationSign);
            }
        });

        binding.btnMultiply.setOnClickListener(view -> {
            if (isCalculate && calculationSign == 'x') {
                binding.btnMultiply.setBackgroundTintList(getResources().getColorStateList(R.color.unclick_sign_button));
                binding.btnMultiply.setTextColor(getResources().getColor(R.color.white));
                isCalculate = false;
            } else {
                isCalculate = true;
                calculationSign = 'x';
                signButtonProcess(calculationSign);
            }
        });

        binding.btnDivide.setOnClickListener(view -> {
            if (isCalculate && calculationSign == '/') {
                binding.btnDivide.setBackgroundTintList(getResources().getColorStateList(R.color.unclick_sign_button));
                binding.btnDivide.setTextColor(getResources().getColor(R.color.white));
                isCalculate = false;
            } else {
                isCalculate = true;
                calculationSign = '/';
                signButtonProcess(calculationSign);
            }
        });

        binding.btnEqual.setOnClickListener(view -> {
            process = binding.tvResult.getText().toString();
            if (process.contains(",")) {
                process = process.replace(',', '.');
            }
            if (count == 0) {
                binding.tvResult.setText(process);
            } else {
                number2 = Double.parseDouble(process);
                switch (calculationSign) {
                    case '+':
                        result = number1 + number2;
                        break;
                    case '-':
                        result = number1 - number2;
                        break;
                    case 'x':
                        result = number1 * number2;
                        break;
                    case '/':
                        result = number1 / number2;
                        break;
                }
                if (((result * 10) % 10) == 0)
                    binding.tvResult.setText(String.valueOf((long) result));
                else {
                    String temp = String.valueOf(result);
                    String strResult = temp;
                    for (int i = temp.length() - 1; i >= 0; i--) {
                        if (temp.charAt(i) != '0') break;
                        else strResult = temp.substring(0, i - 1);
                    }
                    strResult = strResult.replace('.', ',');
                    binding.tvResult.setText(strResult);
                }
                isResult = true;
            }
        });
    }

    private void isRestart(boolean isCalResult, String strNew) {
        if (isCalResult) {
            process = strNew;
            binding.tvResult.setText(process);
            isResult = false;
        }
    }

    @SuppressLint("UseCompatLoadingForColorStateLists")
    private void signButtonProcess(char calculationSign) {
        switch (calculationSign) {
            case '+':
                binding.btnPlus.setBackgroundTintList(getResources().getColorStateList(R.color.onclick_sign_button));
                binding.btnPlus.setTextColor(getResources().getColor(R.color.yellow));
                binding.btnMinus.setBackgroundTintList(getResources().getColorStateList(R.color.unclick_sign_button));
                binding.btnMinus.setTextColor(getResources().getColor(R.color.white));
                binding.btnMultiply.setBackgroundTintList(getResources().getColorStateList(R.color.unclick_sign_button));
                binding.btnMultiply.setTextColor(getResources().getColor(R.color.white));
                binding.btnDivide.setBackgroundTintList(getResources().getColorStateList(R.color.unclick_sign_button));
                binding.btnDivide.setTextColor(getResources().getColor(R.color.white));
                break;
            case '-':
                binding.btnMinus.setBackgroundTintList(getResources().getColorStateList(R.color.onclick_sign_button));
                binding.btnMinus.setTextColor(getResources().getColor(R.color.yellow));
                binding.btnPlus.setBackgroundTintList(getResources().getColorStateList(R.color.unclick_sign_button));
                binding.btnPlus.setTextColor(getResources().getColor(R.color.white));
                binding.btnMultiply.setBackgroundTintList(getResources().getColorStateList(R.color.unclick_sign_button));
                binding.btnMultiply.setTextColor(getResources().getColor(R.color.white));
                binding.btnDivide.setBackgroundTintList(getResources().getColorStateList(R.color.unclick_sign_button));
                binding.btnDivide.setTextColor(getResources().getColor(R.color.white));
                break;
            case 'x':
                binding.btnMultiply.setBackgroundTintList(getResources().getColorStateList(R.color.onclick_sign_button));
                binding.btnMultiply.setTextColor(getResources().getColor(R.color.yellow));
                binding.btnMinus.setBackgroundTintList(getResources().getColorStateList(R.color.unclick_sign_button));
                binding.btnMinus.setTextColor(getResources().getColor(R.color.white));
                binding.btnPlus.setBackgroundTintList(getResources().getColorStateList(R.color.unclick_sign_button));
                binding.btnPlus.setTextColor(getResources().getColor(R.color.white));
                binding.btnDivide.setBackgroundTintList(getResources().getColorStateList(R.color.unclick_sign_button));
                binding.btnDivide.setTextColor(getResources().getColor(R.color.white));
                break;
            case '/':
                binding.btnDivide.setBackgroundTintList(getResources().getColorStateList(R.color.onclick_sign_button));
                binding.btnDivide.setTextColor(getResources().getColor(R.color.yellow));
                binding.btnMinus.setBackgroundTintList(getResources().getColorStateList(R.color.unclick_sign_button));
                binding.btnMinus.setTextColor(getResources().getColor(R.color.white));
                binding.btnMultiply.setBackgroundTintList(getResources().getColorStateList(R.color.unclick_sign_button));
                binding.btnMultiply.setTextColor(getResources().getColor(R.color.white));
                binding.btnPlus.setBackgroundTintList(getResources().getColorStateList(R.color.unclick_sign_button));
                binding.btnPlus.setTextColor(getResources().getColor(R.color.white));
                break;
            case '@':
                binding.btnPlus.setBackgroundTintList(getResources().getColorStateList(R.color.unclick_sign_button));
                binding.btnPlus.setTextColor(getResources().getColor(R.color.white));
                binding.btnMinus.setBackgroundTintList(getResources().getColorStateList(R.color.unclick_sign_button));
                binding.btnMinus.setTextColor(getResources().getColor(R.color.white));
                binding.btnMultiply.setBackgroundTintList(getResources().getColorStateList(R.color.unclick_sign_button));
                binding.btnMultiply.setTextColor(getResources().getColor(R.color.white));
                binding.btnDivide.setBackgroundTintList(getResources().getColorStateList(R.color.unclick_sign_button));
                binding.btnDivide.setTextColor(getResources().getColor(R.color.white));
                break;
        }
    }
}