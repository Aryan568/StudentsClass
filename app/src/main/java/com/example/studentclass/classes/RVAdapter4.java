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

public class RVAdapter4 extends RecyclerView.Adapter<RVAdapter4.ViewHolder> {
    private String data[];
    private int[] imageResources;
    private Context context;
    public RVAdapter4(Context context, String[] data, int[] imageResources) {
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

        if (data[position]=="matter"||data[position]=="around"||data[position]=="atoms"||data[position]=="structure"||data[position]=="fundamental"){

        }else {

            holder.imageView.setImageResource(imageResources[position]);
            holder.textView.setText(data[position]);
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = holder.getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {

                        if (data[data.length-1]=="matter") {

                            String[] videoPaths = {"matter1.mp4", "matter2.mp4", "matter3.mp4", "matter4.mp4", "matter5.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("matter1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.matter1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("matter2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.matter2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("matter3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.matter3;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("matter4.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.matter4;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("matter5.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.matter5;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            }

                        }else if (data[data.length-1]=="around"){

                            String[] videoPaths = {"around1.mp4", "around.mp4", "around.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("around1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.around1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("around2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.around2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("around3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.around3;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            }

                        }else if (data[data.length-1]=="atoms"){
                            String[] videoPaths = {"atoms1.mp4", "atoms2.mp4", "atoms3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("atoms1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.atoms1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("atoms2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.atoms2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("atoms3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.atoms3;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            }


                        }else if (data[data.length-1]=="structure"){

                            String[] videoPaths = {"structure1.mp4", "structure2.mp4", "structure.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("structure1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.structure1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("structure2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.structure2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("structure3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.structure3;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            }

                        }else if (data[data.length-1]=="fundamental"){

                            String[] videoPaths = {"fundamental1.mp4", "fundamental2.mp4", "fundamental3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("fundamental1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.fundamental1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("fundamental2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.fundamental2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("fundamental3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.fundamental3;
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

                        if (data[data.length-1]=="matter") {

                            String[] videoPaths = {"matter1.mp4", "matter2.mp4", "matter3.mp4", "matter4.mp4", "matter5.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("matter1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.matter1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("matter2.mp4")) {

                            } else if (videoPath.equals("matter3.mp4")) {

                            } else if (videoPath.equals("matter4.mp4")) {

                            } else if (videoPath.equals("matter5.mp4")) {

                            }

                        }else if (data[data.length-1]=="around"){

                            String[] videoPaths = {"around1.mp4", "around.mp4", "around.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("around1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.around1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("around2.mp4")) {

                            } else if (videoPath.equals("around3.mp4")) {

                            }

                        }else if (data[data.length-1]=="atoms"){

                            String[] videoPaths = {"atoms1.mp4", "atoms2.mp4", "atoms3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("atoms1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.atoms1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("atoms2.mp4")) {

                            } else if (videoPath.equals("atoms3.mp4")) {

                            }

                        }else if (data[data.length-1]=="structure"){

                            String[] videoPaths = {"structure1.mp4", "structure2.mp4", "structure3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("structure1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.structure1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("structure2.mp4")) {

                            } else if (videoPath.equals("structure3.mp4")) {

                            }

                        }else if (data[data.length-1]=="fundamental"){

                            String[] videoPaths = {"fundamental1.mp4", "fundamental2.mp4", "fundamental3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("fundamental1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.fundamental1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("fundamental2.mp4")) {

                            } else if (videoPath.equals("fundamental3.mp4")) {

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



