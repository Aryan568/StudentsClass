package com.example.studentclass.classes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.studentclass.R;
import com.example.studentclass.video;

public class RVAdapter2 extends RecyclerView.Adapter<RVAdapter2.ViewHolder> {
    private String data[];
    private int[] imageResources;
    private Context context;
    public RVAdapter2(Context context, String[] data, int[] imageResources) {
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

        if (data[position]=="plants"||data[position]=="animals"||data[position]=="fabric"||data[position]=="heat"||data[position]=="acids"){

        }else {

            holder.imageView.setImageResource(imageResources[position]);
            holder.textView.setText(data[position]);
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = holder.getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {

                        if (data[data.length-1]=="plants") {

                            String[] videoPaths = {"plant1.mp4", "plant2.mp4", "plant3.mp4", "plant4.mp4", "plant5.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("plant1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.plant1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("plant2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.plant2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("plant3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.plant3;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("plant4.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.plant4;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("plant5.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.plant5;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            }

                        }else if (data[data.length-1]=="animals"){

                            String[] videoPaths = {"animals1.mp4", "animals.mp4", "animals.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("animals1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.animals1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("animals2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.animals2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("animals3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.animals3;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            }

                        }else if (data[data.length-1]=="fabric"){
                            String[] videoPaths = {"fabric1.mp4", "fabric2.mp4", "fabric3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("fabric1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.fabric1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("fabric2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.fabric2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("fabric3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.fabric3;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            }


                        }else if (data[data.length-1]=="heat"){

                            String[] videoPaths = {"heat1.mp4", "heat2.mp4", "heat.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("heat1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.heat1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("heat2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.heat2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("heat3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.heat3;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            }

                        }else if (data[data.length-1]=="acids"){

                            String[] videoPaths = {"acids1.mp4", "acids2.mp4", "acids3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("acids1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.acids1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("acids2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.acids2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("acids3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.acids3;
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

                        if (data[data.length-1]=="plants") {

                            String[] videoPaths = {"plants1.mp4", "plants2.mp4", "plants3.mp4", "plants4.mp4", "plants5.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("plants1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.plant1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("plants2.mp4")) {

                            } else if (videoPath.equals("plants3.mp4")) {

                            } else if (videoPath.equals("plants4.mp4")) {

                            } else if (videoPath.equals("plants5.mp4")) {

                            }

                        }else if (data[data.length-1]=="animals"){

                            String[] videoPaths = {"animals1.mp4", "animals.mp4", "animals.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("animals1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.animals1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("animals2.mp4")) {

                            } else if (videoPath.equals("animals3.mp4")) {

                            }

                        }else if (data[data.length-1]=="fabric"){

                            String[] videoPaths = {"fabric1.mp4", "fabric2.mp4", "fabric3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("fabric1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.fabric1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("fabric2.mp4")) {

                            } else if (videoPath.equals("fabric3.mp4")) {

                            }

                        }else if (data[data.length-1]=="heat"){

                            String[] videoPaths = {"heat1.mp4", "heat2.mp4", "heat3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("heat1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.heat1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("heat2.mp4")) {

                            } else if (videoPath.equals("heat3.mp4")) {

                            }

                        }else if (data[data.length-1]=="acids"){

                            String[] videoPaths = {"acids1.mp4", "acids2.mp4", "acids3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("acids1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.acids1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("acids2.mp4")) {

                            } else if (videoPath.equals("acids3.mp4")) {

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



