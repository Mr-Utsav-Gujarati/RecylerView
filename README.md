# RecylerView Java
How to use RecylerView in android.

How to highlight an image by clicking on it.

Using androidx recyclerview.

<androidx.recyclerview.widget.RecyclerView
        android:layout_width="match_parent"
        android:id="@+id/RvDemo"
        android:layout_height="wrap_content"
        android:orientation="vertical">
        
 </androidx.recyclerview.widget.RecyclerView>

Click image to highlights.

  if (holder.rlborder.getBackground() == null) {
                holder.rlborder.setBackgroundResource(R.drawable.shap);
            } else {
                holder.rlborder.setBackground(null);
            }

 
 
