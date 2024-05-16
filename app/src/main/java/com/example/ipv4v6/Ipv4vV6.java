package com.example.ipv4v6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Ipv4vV6 extends AppCompatActivity {
    private int[] octet = new int[25];

    TextView networkAnswer1TextView;
    TextView networkAnswer2TextView;
    TextView networkAnswer3TextView ;
    TextView networkAnswer4TextView;
    TextView firstHostAnswer1TextView;
    TextView firstHostAnswer2TextView ;
    TextView firstHostAnswer3TextView;
    TextView firstHostAnswer4TextView ;
    TextView lastHostAnswer1TextView ;
    TextView lastHostAnswer2TextView;
    TextView lastHostAnswer3TextView ;
    TextView lastHostAnswer4TextView ;
    TextView broadcastAnswer1TextView ;
    TextView broadcastAnswer2TextView ;
    TextView broadcastAnswer3TextView;
    TextView broadcastAnswer4TextView ;
    TextView nextSubnetAnswer1TextView ;
    TextView nextSubnetAnswer2TextView ;
    TextView nextSubnetAnswer3TextView;
    TextView nextSubnetAnswer4TextView ;

    TextView target_ip_edit_text0;
    TextView target_ip_edit_text1;
    TextView target_ip_edit_text2;
    TextView target_ip_edit_text3;
    TextView target_ip_edit_text4;

    Button network_show_button1,network_show_button2,network_show_button3,network_show_button4,network_show_button5,submit_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipv4v_v6);


            Button checkAllButton = findViewById(R.id.check_all_button);
            Button showAllButton = findViewById(R.id.show_all_button);
            Button new_problem_button=findViewById(R.id.new_problem_button);
           networkAnswer1TextView = findViewById(R.id.networkAnswer1TextView);
            networkAnswer2TextView = findViewById(R.id.networkAnswer2TextView);
            networkAnswer3TextView = findViewById(R.id.networkAnswer3TextView);
            networkAnswer4TextView = findViewById(R.id.networkAnswer4TextView);
            firstHostAnswer1TextView = findViewById(R.id.firstHostAnswer1TextView);
            firstHostAnswer2TextView = findViewById(R.id.firstHostAnswer2TextView);
            firstHostAnswer3TextView = findViewById(R.id.firstHostAnswer3TextView);
            firstHostAnswer4TextView = findViewById(R.id.firstHostAnswer4TextView);
            lastHostAnswer1TextView = findViewById(R.id.lastHostAnswer1TextView);
            lastHostAnswer2TextView = findViewById(R.id.lastHostAnswer2TextView);
            lastHostAnswer3TextView = findViewById(R.id.lastHostAnswer3TextView);
            lastHostAnswer4TextView = findViewById(R.id.lastHostAnswer4TextView);
            broadcastAnswer1TextView = findViewById(R.id.broadcastAnswer1TextView);
            broadcastAnswer2TextView = findViewById(R.id.broadcastAnswer2TextView);
            broadcastAnswer3TextView = findViewById(R.id.broadcastAnswer3TextView);
            broadcastAnswer4TextView = findViewById(R.id.broadcastAnswer4TextView);
            nextSubnetAnswer1TextView = findViewById(R.id.nextSubnetAnswer1TextView);
            nextSubnetAnswer2TextView = findViewById(R.id.nextSubnetAnswer2TextView);
            nextSubnetAnswer3TextView = findViewById(R.id.nextSubnetAnswer3TextView);
            nextSubnetAnswer4TextView = findViewById(R.id.nextSubnetAnswer4TextView);

            target_ip_edit_text0=findViewById(R.id.target_ip_edit_text0);
            target_ip_edit_text1=findViewById(R.id.target_ip_edit_text1);
            target_ip_edit_text2=findViewById(R.id.target_ip_edit_text2);
            target_ip_edit_text3=findViewById(R.id.target_ip_edit_text3);
            target_ip_edit_text4=findViewById(R.id.target_ip_edit_text4);

            network_show_button1=findViewById(R.id.network_show_button1);
            network_show_button2=findViewById(R.id.network_show_button2);
            network_show_button3=findViewById(R.id.network_show_button3);
            network_show_button4=findViewById(R.id.network_show_button4);
            network_show_button5=findViewById(R.id.network_show_button5);



            network_show_button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String network1=networkAnswer1TextView.getText().toString();
                    String network2=networkAnswer2TextView.getText().toString();
                    String network3=networkAnswer3TextView.getText().toString();
                    String network4=networkAnswer4TextView.getText().toString();
                    if(!network1.isEmpty() && !network2.isEmpty() && !network3.isEmpty() && !network4.isEmpty()) {

                        if (Integer.parseInt(networkAnswer1TextView.getText().toString()) == octet[20] &&
                                Integer.parseInt(networkAnswer2TextView.getText().toString()) == octet[5] &&
                                Integer.parseInt(networkAnswer3TextView.getText().toString()) == octet[6] &&
                                Integer.parseInt(networkAnswer4TextView.getText().toString()) == octet[7]) {
                            network_show_button1.setText("Correct");


                        } else {
                            network_show_button1.setText("Incorrect");

                        }
                    }else {
                        Toast.makeText(Ipv4vV6.this, "Calculate Value First", Toast.LENGTH_LONG).show();
                    }

                }
            });
        network_show_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Fhost1=firstHostAnswer1TextView.getText().toString();
                String Fhost2=firstHostAnswer2TextView.getText().toString();
                String Fhost3=firstHostAnswer3TextView.getText().toString();
                String Fhost4=firstHostAnswer4TextView.getText().toString();
                if(!Fhost1.isEmpty() && !Fhost2.isEmpty() && !Fhost3.isEmpty() && !Fhost4.isEmpty() ) {

                    if (Integer.parseInt(firstHostAnswer1TextView.getText().toString()) == octet[21] &&
                            Integer.parseInt(firstHostAnswer2TextView.getText().toString()) == octet[8] &&
                            Integer.parseInt(firstHostAnswer3TextView.getText().toString()) == octet[9] &&
                            Integer.parseInt(firstHostAnswer4TextView.getText().toString()) == octet[10]) {
                        network_show_button2.setText("Correct");

                    } else {
                        network_show_button2.setText("Incorrect");
                    }
                }else {

                    Toast.makeText(Ipv4vV6.this, "Calculate Value First", Toast.LENGTH_LONG).show();
                }

            }
        });
        network_show_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Lhost1=lastHostAnswer1TextView.getText().toString();
                String Lhost2=lastHostAnswer2TextView.getText().toString();
                String Lhost3=lastHostAnswer3TextView.getText().toString();
                String Lhost4=lastHostAnswer4TextView.getText().toString();

                if(!Lhost1.isEmpty() && !Lhost2.isEmpty() && !Lhost3.isEmpty() && !Lhost4.isEmpty() ) {

                    if (Integer.parseInt(lastHostAnswer1TextView.getText().toString()) == octet[22] &&
                            Integer.parseInt(lastHostAnswer2TextView.getText().toString()) == octet[11] &&
                            Integer.parseInt(lastHostAnswer3TextView.getText().toString()) == octet[12] &&
                            Integer.parseInt(lastHostAnswer4TextView.getText().toString()) == octet[13]) {
                        network_show_button3.setText("Correct");

                    } else {
                        network_show_button3.setText("Incorrect");
                    }
                }else {
                    Toast.makeText(Ipv4vV6.this, "Calculate Value First", Toast.LENGTH_LONG).show();

                }
            }
        });
        network_show_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String bcast1=broadcastAnswer1TextView.getText().toString();
                String bcast2=broadcastAnswer2TextView.getText().toString();
                String bcast3=broadcastAnswer3TextView.getText().toString();
                String bcast4=broadcastAnswer4TextView.getText().toString();

                if(!bcast1.isEmpty() &&  !bcast2.isEmpty() && !bcast3.isEmpty() && !bcast4.isEmpty() ) {

                    if (Integer.parseInt(broadcastAnswer1TextView.getText().toString()) == octet[23] &&
                            Integer.parseInt(broadcastAnswer2TextView.getText().toString()) == octet[14] &&
                            Integer.parseInt(broadcastAnswer3TextView.getText().toString()) == octet[15] &&
                            Integer.parseInt(broadcastAnswer4TextView.getText().toString()) == octet[16]) {
                        network_show_button4.setText("Correct");

                    } else {
                        network_show_button4.setText("Incorrect");
                    }
                }else {
                    Toast.makeText(Ipv4vV6.this, "Calculate Value First", Toast.LENGTH_LONG).show();
                }
            }
        });
        network_show_button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nsubnet1=nextSubnetAnswer1TextView.getText().toString();
                String nsubnet2=nextSubnetAnswer2TextView.getText().toString();
                String nsubnet3=nextSubnetAnswer3TextView.getText().toString();
                String nsubnet4=nextSubnetAnswer4TextView.getText().toString();

                if(!nsubnet1.isEmpty() &&  !nsubnet2.isEmpty() &&  !nsubnet3.isEmpty() &&  !nsubnet4.isEmpty() ) {

                    if (Integer.parseInt(nextSubnetAnswer1TextView.getText().toString()) == octet[24] &&
                            Integer.parseInt(nextSubnetAnswer2TextView.getText().toString()) == octet[17] &&
                            Integer.parseInt(nextSubnetAnswer3TextView.getText().toString()) == octet[18] &&
                            Integer.parseInt(nextSubnetAnswer4TextView.getText().toString()) == octet[19]) {
                        network_show_button5.setText("Correct");


                    } else {
                        network_show_button5.setText("Incorrect");
                    }
                }else {
                    Toast.makeText(Ipv4vV6.this, "Calculate Value First", Toast.LENGTH_LONG).show();
                }
            }
        });
        new_problem_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                target_ip_edit_text0.setText(String.valueOf(octet[1]));
                target_ip_edit_text1.setText(String.valueOf(octet[2]));
                target_ip_edit_text2.setText(String.valueOf(octet[3]));
                target_ip_edit_text3.setText(String.valueOf(octet[4]));
                target_ip_edit_text4.setText(String.valueOf(octet[0]));
                clearForm();
            }
        });

        submit_button=findViewById(R.id.submit_button);
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String target1=target_ip_edit_text0.getText().toString();
                String target2=target_ip_edit_text1.getText().toString();
                String target3=target_ip_edit_text2.getText().toString();
                String target4=target_ip_edit_text3.getText().toString();
                String target5=target_ip_edit_text4.getText().toString();
                if(!target1.isEmpty() && !target2.isEmpty() && !target3.isEmpty() && !target4.isEmpty() &&  !target5.isEmpty()  ) {

                    int given1 = Integer.parseInt(target_ip_edit_text0.getText().toString());

                    int given2 = Integer.parseInt(target_ip_edit_text1.getText().toString());

                    int given3 = Integer.parseInt(target_ip_edit_text2.getText().toString());

                    int given4 = Integer.parseInt(target_ip_edit_text3.getText().toString());

                    int given5 = Integer.parseInt(target_ip_edit_text4.getText().toString());

                    octet[1] = given1;
                    octet[2] = given2;
                    octet[3] = given3;
                    octet[4] = given4;
                    octet[0] = given5;

                    calculateOctets();
                    showAll();
                }else {
                    Toast.makeText(Ipv4vV6.this, "Enter Valid IP Address", Toast.LENGTH_LONG).show();
                }

            }
        });


        checkAllButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String target1=target_ip_edit_text0.getText().toString();
                String target2=target_ip_edit_text1.getText().toString();
                String target3=target_ip_edit_text2.getText().toString();
                String target4=target_ip_edit_text3.getText().toString();
                String target5=target_ip_edit_text4.getText().toString();
                try {

                    if (!target1.isEmpty() && !target2.isEmpty() && !target3.isEmpty() && !target4.isEmpty() && !target5.isEmpty()) {

                        calculateOctets();
                        checkAll();
                    } else {
                        Toast.makeText(Ipv4vV6.this, "Enter Valid IP Address", Toast.LENGTH_LONG).show();
                    }
                }catch (NumberFormatException e){
                    Toast.makeText(Ipv4vV6.this, "Click On Submit Button First", Toast.LENGTH_LONG).show();
                }

            }
        });

        showAllButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAll();
            }
        });

    }




    private void clearForm() {
        Random random = new Random();
        int i = random.nextInt(3);

        if (i == 0) {
            octet[0] = 8 + random.nextInt(22);
            octet[1] = 1 + random.nextInt(126);
        } else if (i == 1) {
            octet[0] = 16 + random.nextInt(14);
            octet[1] = 128 + random.nextInt(63);
        } else if (i == 2) {
            octet[0] = 24 + random.nextInt(6);
            octet[1] = 192 + random.nextInt(31);
        }

        octet[2] = random.nextInt(255);
        octet[3] = random.nextInt(255);
        octet[4] = random.nextInt(255);



       /* TextView givenMaskTextView = findViewById(R.id.given_mask_text_view);
        givenMaskTextView.setText(String.valueOf(octet[0]));*/

        calculateOctets();
    }

    private void calculateOctets() {
        int j = 1;
        int i = octet[0] % 8;
        for (i = 8 - octet[0] % 8; i > 0; i--) {
            j = j * 2;
        }

        if (octet[0] < 16) {
            if (octet[0] < 8) {
                octet[21] = octet[20] = (octet[1] / j) * j;
                octet[10] = 1;
                octet[11] = octet[14] = octet[5] + j - 1;
                octet[23] = octet[22] = octet[21] + j - 1;
                octet[12] = octet[15] = octet[16] = 255;
                octet[11] = octet[14] = octet[17] = 255;
                octet[13] = 254;
                octet[18] = octet[15];
                octet[24] = octet[23];
                octet[6] = 0;
                octet[9] = 0;
                octet[5] = 0;
                octet[8] = 0;
                octet[7] = 0;
                octet[19] = octet[16];
                if (octet[19] > 254) {
                    octet[19] = 0;
                    octet[18] = octet[18] + 1;
                }
                if (octet[18] > 254) {
                    octet[18] = 0;
                    octet[17] = octet[17] + 1;
                }
                if (octet[17] > 254) {
                    octet[17] = 0;
                    if ((octet[23] + 1) > 255) {
                        octet[24] = 255;
                    } else {
                        octet[24] = (octet[23] + 1);
                    }
                }
                if ((octet[23] == 255) && (octet[14] == 255) && (octet[15] == 255) && (octet[16] == 255)) {
                    octet[24] = 255;
                    octet[17] = 255;
                    octet[18] = 255;
                    octet[19] = 255;
                }
            } else {
                octet[5] = octet[8] = (octet[2] / j) * j;
                octet[10] = 1;
                octet[11] = octet[14] = octet[5] + j - 1;
                octet[12] = octet[15] = octet[16] = 255;
                octet[20] = octet[1];
                octet[13] = 254;
                octet[20] = octet[1];
                octet[21] = octet[1];
                octet[22] = octet[1];
                octet[23] = octet[1];
                octet[24] = octet[1];
                octet[18] = octet[15] + 1;
                octet[6] = octet[9] = 0;
                octet[7] = 0;
                octet[17] = octet[14] + 1;
                if (octet[17] > 255) {
                    octet[17] = 0;
                    octet[24] = (octet[23] + 1);
                }
            }
        } else {
            if (octet[0] < 24) {
                octet[5] = octet[8] = octet[11] = octet[14] = octet[2];
                octet[6] = octet[9] = (octet[3] / j) * j;
                octet[12] = octet[15] = octet[6] + j - 1;
                octet[7] = 0;
                octet[20] = octet[1];
                octet[10] = 1;
                octet[13] = 254;
                octet[16] = 255;
                octet[20] = octet[1];
                octet[21] = octet[1];
                octet[22] = octet[1];
                octet[23] = octet[1];
                octet[24] = octet[1];
                octet[19] = 0;
                octet[18] = octet[15] + 1;
                octet[17] = octet[14];
                if (octet[18] > 255) {
                    octet[18] = 0;
                    octet[17] = octet[17] + 1;
                }
                if (octet[17] > 255) {
                    octet[17] = 0;
                    octet[24] = octet[23] + 1;
                }
            } else {
                octet[5] = octet[8] = octet[11] = octet[14] = octet[2];
                octet[6] = octet[9] = octet[12] = octet[15] = octet[3];
                octet[7] = (octet[4] / j) * j;
                octet[10] = octet[7] + 1;
                octet[16] = octet[7] + j - 1;
                octet[13] = octet[16] - 1;
                octet[19] = octet[16] + 1;
                octet[20] = octet[1];
                octet[21] = octet[1];
                octet[22] = octet[1];
                octet[23] = octet[1];
                octet[24] = octet[1];
                octet[18] = octet[15];
                octet[17] = octet[14];
                if (octet[19] > 255) {
                    octet[19] = 0;
                    octet[18] = octet[18] + 1;
                }
                if (octet[18] > 255) {
                    octet[18] = 0;
                    octet[17] = octet[17] + 1;
                }
                if (octet[17] > 255) {
                    octet[17] = 0;
                    octet[24] = octet[23] + 1;
                }
            }
        }
    }

    private void showAll() {
        // Logic to display selected addresses



        networkAnswer1TextView.setText(String.valueOf(octet[20]));
        networkAnswer2TextView.setText(String.valueOf(octet[5]));
        networkAnswer3TextView.setText(String.valueOf(octet[6]));
        networkAnswer4TextView.setText(String.valueOf(octet[7]));

        firstHostAnswer1TextView.setText(String.valueOf(octet[21]));
        firstHostAnswer2TextView.setText(String.valueOf(octet[8]));
        firstHostAnswer3TextView.setText(String.valueOf(octet[9]));
        firstHostAnswer4TextView.setText(String.valueOf(octet[10]));

        lastHostAnswer1TextView.setText(String.valueOf(octet[22]));
        lastHostAnswer2TextView.setText(String.valueOf(octet[11]));
        lastHostAnswer3TextView.setText(String.valueOf(octet[12]));
        lastHostAnswer4TextView.setText(String.valueOf(octet[13]));

        broadcastAnswer1TextView.setText(String.valueOf(octet[23]));
        broadcastAnswer2TextView.setText(String.valueOf(octet[14]));
        broadcastAnswer3TextView.setText(String.valueOf(octet[15]));
        broadcastAnswer4TextView.setText(String.valueOf(octet[16]));

        nextSubnetAnswer1TextView.setText(String.valueOf(octet[24]));
        nextSubnetAnswer2TextView.setText(String.valueOf(octet[17]));
        nextSubnetAnswer3TextView.setText(String.valueOf(octet[18]));
        nextSubnetAnswer4TextView.setText(String.valueOf(octet[19]));

    }

    private void checkAll() {
        // Logic to check answer input

        if (Integer.parseInt(networkAnswer1TextView.getText().toString()) == octet[20] &&
                Integer.parseInt(networkAnswer2TextView.getText().toString()) == octet[5] &&
                Integer.parseInt(networkAnswer3TextView.getText().toString()) == octet[6] &&
                Integer.parseInt(networkAnswer4TextView.getText().toString()) == octet[7]) {
            network_show_button1.setText("Correct");


        } else {
            network_show_button1.setText("Incorrect");

        }
        if (Integer.parseInt(firstHostAnswer1TextView.getText().toString()) == octet[21] &&
                Integer.parseInt(firstHostAnswer2TextView.getText().toString()) == octet[8] &&
                Integer.parseInt(firstHostAnswer3TextView.getText().toString()) == octet[9] &&
                Integer.parseInt(firstHostAnswer4TextView.getText().toString()) == octet[10]) {
            network_show_button2.setText("Correct");

        } else {
            network_show_button2.setText("Incorrect");
        }

        if (Integer.parseInt(lastHostAnswer1TextView.getText().toString()) == octet[22] &&
                Integer.parseInt(lastHostAnswer2TextView.getText().toString()) == octet[11] &&
                Integer.parseInt(lastHostAnswer3TextView.getText().toString()) == octet[12] &&
                Integer.parseInt(lastHostAnswer4TextView.getText().toString()) == octet[13]) {
           network_show_button3.setText("Correct");

        } else {
            network_show_button3.setText("Incorrect");
        }
        if (Integer.parseInt(broadcastAnswer1TextView.getText().toString()) == octet[23] &&
                Integer.parseInt(broadcastAnswer2TextView.getText().toString()) == octet[14] &&
                Integer.parseInt(broadcastAnswer3TextView.getText().toString()) == octet[15] &&
                Integer.parseInt(broadcastAnswer4TextView.getText().toString()) == octet[16]) {
           network_show_button4.setText("Correct");

        } else {
            network_show_button4.setText("Incorrect");
        }
        if (Integer.parseInt(nextSubnetAnswer1TextView.getText().toString()) == octet[24] &&
                Integer.parseInt(nextSubnetAnswer2TextView.getText().toString()) == octet[17] &&
                Integer.parseInt(nextSubnetAnswer3TextView.getText().toString()) == octet[18] &&
                Integer.parseInt(nextSubnetAnswer4TextView.getText().toString()) == octet[19]) {
            network_show_button5.setText("Correct");


        } else {
            network_show_button5.setText("Incorrect");
        }
    }



}