# RecylerView Java
How to use RecylerView in android.
code by utsav

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

![ss_1](https://github.com/user-attachments/assets/13e3ba9a-aa35-4334-b511-d07022f161b4)




https://github.com/user-attachments/assets/611173a4-62e3-4c5a-92f1-0f3eb5d424af


 
