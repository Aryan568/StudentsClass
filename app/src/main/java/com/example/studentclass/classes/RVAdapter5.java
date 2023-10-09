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

public class RVAdapter5 extends RecyclerView.Adapter<RVAdapter5.ViewHolder> {
    private String data[];
    private int[] imageResources;
    private Context context;
    public RVAdapter5(Context context, String[] data, int[] imageResources) {
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

        if (data[position]=="chemical"||data[position]=="bases"||data[position]=="and"||data[position]=="compounds"||data[position]=="elements"){

        }else {

            holder.imageView.setImageResource(imageResources[position]);
            holder.textView.setText(data[position]);
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = holder.getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {

                        if (data[data.length-1]=="chemical") {

                            String[] videoPaths = {"chemical1.mp4", "chemical2.mp4", "chemical3.mp4", "chemical4.mp4", "chemical5.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("chemical1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.chemical1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("chemical2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.chemical2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("chemical3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.chemical3;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("chemical4.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.chemical4;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("chemical5.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.chemical5;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            }

                        }else if (data[data.length-1]=="bases"){

                            String[] videoPaths = {"bases1.mp4", "bases2.mp4", "bases3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("bases1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.bases1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("bases2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.bases2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("bases3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.bases3;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            }

                        }else if (data[data.length-1]=="and"){
                            String[] videoPaths = {"and1.mp4", "and2.mp4", "and3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("and1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.and1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("and2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.and2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("and3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.and3;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            }


                        }else if (data[data.length-1]=="compounds"){

                            String[] videoPaths = {"compounds1.mp4", "compounds2.mp4", "compounds3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("compounds1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.compounds1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("compounds2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.compounds2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("compounds3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.compounds3;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            }

                        }else if (data[data.length-1]=="elements"){

                            String[] videoPaths = {"elements1.mp4", "elements2.mp4", "elements3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("elements1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.elements1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("elements2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.elements2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("elements3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.elements3;
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

                        if (data[data.length-1]=="chemical") {

                            String[] videoPaths = {"chemical1.mp4", "chemical2.mp4", "chemical3.mp4", "chemical4.mp4", "chemical5.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("chemical1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.chemical1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("chemical2.mp4")) {

                            } else if (videoPath.equals("chemical3.mp4")) {

                            } else if (videoPath.equals("chemical4.mp4")) {

                            } else if (videoPath.equals("chemical5.mp4")) {

                            }

                        }else if (data[data.length-1]=="bases"){

                            String[] videoPaths = {"bases1.mp4", "bases.mp4", "bases.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("bases1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.bases1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("bases2.mp4")) {

                            } else if (videoPath.equals("bases3.mp4")) {

                            }

                        }else if (data[data.length-1]=="and"){

                            String[] videoPaths = {"and1.mp4", "and2.mp4", "and3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("and1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.and1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("and2.mp4")) {

                            } else if (videoPath.equals("and3.mp4")) {

                            }

                        }else if (data[data.length-1]=="and"){

                            String[] videoPaths = {"compounds1.mp4", "compounds2.mp4", "compounds3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("compounds1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.compounds1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("compounds2.mp4")) {

                            } else if (videoPath.equals("compounds3.mp4")) {

                            }

                        }else if (data[data.length-1]=="elements"){

                            String[] videoPaths = {"elements1.mp4", "elements2.mp4", "elements3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("elements1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.elements1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("elements2.mp4")) {

                            } else if (videoPath.equals("elements3.mp4")) {

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



