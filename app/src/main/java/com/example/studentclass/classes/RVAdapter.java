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

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder> {
    private String data[];
    private int[] imageResources;
    private Context context;
    public RVAdapter(Context context, String[] data, int[] imageResources) {
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

        if (data[position]=="food"||data[position]=="components"||data[position]=="fibre"||data[position]=="materials"||data[position]=="substances"){

        }else {

            holder.imageView.setImageResource(imageResources[position]);
            holder.textView.setText(data[position]);
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = holder.getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {

                        if (data[data.length-1]=="food") {

                            String[] videoPaths = {"food1.mp4", "food2.mp4", "food3.mp4", "food4.mp4", "food5.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("food1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.food1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("food2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.food2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("food3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.food3;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("food4.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.food4;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("food5.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.food5;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            }

                        }else if (data[data.length-1]=="components"){

                            String[] videoPaths = {"components1.mp4", "components.mp4", "components.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("components1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.components1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("components2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.components2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("components3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.components3;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            }

                        }else if (data[data.length-1]=="fibre"){
                            String[] videoPaths = {"fibre1.mp4", "fibre2.mp4", "fibre3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("fibre1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.fibre1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("fibre2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.fibre2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("fibre3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.fibre3;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            }


                        }else if (data[data.length-1]=="materials"){

                            String[] videoPaths = {"materials1.mp4", "materials2.mp4", "materials.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("materials1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.materials1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("materials2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.materials2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("materials3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.materials3;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            }

                        }else if (data[data.length-1]=="substances"){

                            String[] videoPaths = {"substances1.mp4", "substances2.mp4", "substances3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("substances1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.substances1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("substances2.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.substances2;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("substances3.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.substances3;
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

                        if (data[data.length-1]=="food") {

                            String[] videoPaths = {"food1.mp4", "food2.mp4", "food3.mp4", "food4.mp4", "food5.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("food1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.food1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("food2.mp4")) {

                            } else if (videoPath.equals("food3.mp4")) {

                            } else if (videoPath.equals("food4.mp4")) {

                            } else if (videoPath.equals("food5.mp4")) {

                            }

                        }else if (data[data.length-1]=="components"){

                            String[] videoPaths = {"components1.mp4", "components.mp4", "components.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("components1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.food1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("components2.mp4")) {

                            } else if (videoPath.equals("components3.mp4")) {

                            }

                        }else if (data[data.length-1]=="fibre"){

                            String[] videoPaths = {"fibre1.mp4", "fibre2.mp4", "fibre3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("fibre1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.food1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("fibre2.mp4")) {

                            } else if (videoPath.equals("fibre3.mp4")) {

                            }

                        }else if (data[data.length-1]=="materials"){

                            String[] videoPaths = {"materials1.mp4", "materials2.mp4", "materials3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("materials1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.food1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("materials2.mp4")) {

                            } else if (videoPath.equals("materials3.mp4")) {

                            }

                        }else if (data[data.length-1]=="substances"){

                            String[] videoPaths = {"substances1.mp4", "substances2.mp4", "substances3.mp4"};
                            String videoPath = videoPaths[position];
                            if (videoPath.equals("substances1.mp4")) {
                                String videoPat = "android.resource://" + context.getPackageName() + "/" + R.raw.food1;
                                Intent intent = new Intent(context, video.class);
                                intent.putExtra("video_path", videoPat);
                                context.startActivity(intent);
                            } else if (videoPath.equals("substances2.mp4")) {

                            } else if (videoPath.equals("substances3.mp4")) {

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



