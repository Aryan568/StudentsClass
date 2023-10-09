package com.example.studentclass.classes;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.studentclass.R;
import com.example.studentclass.video;

public class RVAdapter3 extends RecyclerView.Adapter<RVAdapter3.ViewHolder> {
    private String data[];
    private int[] imageResources;
    private Context context;
    public RVAdapter3(Context context, String[] data, int[] imageResources) {
        this.context = context;
        this.data = data;
        this.imageResources = imageResources;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.vidimg);
            textView = itemView.findViewById(R.id.vidtxt);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        if (data[position]=="crop"||data[position]=="microorganisms"||data[position]=="synthetic"||data[position]=="metals"||data[position]=="coal"){

        }else {

            holder.imageView.setImageResource(imageResources[position]);
            holder.textView.setText(data[position]);
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = holder.getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {

                        if (data[data.length-1]=="crop") {

                            String[] videoPaths = {"crop1.mp4", "crop2.mp4", "crop3.mp4", "crop4.mp4", "crop5.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("crop1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.crop1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("crop2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.crop2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("crop3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.crop3;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("crop4.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.crop4;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("crop5.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.crop5;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            }

                        }else if (data[data.length-1]=="microorganisms"){

                            String[] videoPaths = {"microorganisms1.mp4", "microorganisms.mp4", "microorganisms.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("microorganisms1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.microorganisms1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("microorganisms2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.microorganisms2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("microorganisms3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.microorganisms3;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            }

                        }else if (data[data.length-1]=="synthetic"){
                            String[] videoPaths = {"synthetic1.mp4", "synthetic2.mp4", "synthetic3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("synthetic1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.synthetic1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("synthetic2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.synthetic2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("synthetic3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.synthetic3;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            }


                        }else if (data[data.length-1]=="metals"){

                            String[] videoPaths = {"metals1.mp4", "metals2.mp4", "metals.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("metals1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.metals1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("metals2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.metals2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("metals3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.metals3;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            }

                        }else if (data[data.length-1]=="coal"){

                            String[] videoPaths = {"coal1.mp4", "coal2.mp4", "coal3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("coal1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.coal1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("coal2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.coal2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("coal3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.coal3;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            }

                        }

                    }

                }

            });
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = holder.getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {

                        if (data[data.length-1]=="crop") {

                            String[] videoPaths = {"crop1.mp4", "crop2.mp4", "crop3.mp4", "crop4.mp4", "crop5.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("crop1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.crop1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("crop2.mp4")) {

                            } else if (videoPath.equals("crop3.mp4")) {

                            } else if (videoPath.equals("crop4.mp4")) {

                            } else if (videoPath.equals("crop5.mp4")) {

                            }

                        }else if (data[data.length-1]=="microorganisms"){

                            String[] videoPaths = {"microorganisms1.mp4", "microorganisms.mp4", "microorganisms.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("microorganisms1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.microorganisms1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("microorganisms2.mp4")) {

                            } else if (videoPath.equals("microorganisms3.mp4")) {

                            }

                        }else if (data[data.length-1]=="synthetic"){

                            String[] videoPaths = {"synthetic1.mp4", "synthetic2.mp4", "synthetic3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("synthetic1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.synthetic1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("synthetic2.mp4")) {

                            } else if (videoPath.equals("synthetic3.mp4")) {

                            }

                        }else if (data[data.length-1]=="metals"){

                            String[] videoPaths = {"metals1.mp4", "metals2.mp4", "metals3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("metals1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.metals1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("metals2.mp4")) {

                            } else if (videoPath.equals("metals3.mp4")) {

                            }

                        }else if (data[data.length-1]=="coal"){

                            String[] videoPaths = {"coal1.mp4", "coal2.mp4", "coal3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("coal1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.coal1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("coal2.mp4")) {

                            } else if (videoPath.equals("coal3.mp4")) {

                            }

                        }

                    }
                }
            });

        }

    }

    @Override
    public int getItemCount() {
        return data.length;
    }
}



