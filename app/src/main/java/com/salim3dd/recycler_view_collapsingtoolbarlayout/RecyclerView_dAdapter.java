package com.salim3dd.recycler_view_collapsingtoolbarlayout;

/**
 * Created by Salim3dd on 01/12/2016.
 */


        import android.content.Context;
        import android.support.v7.widget.CardView;
        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.squareup.picasso.Picasso;

        import java.util.List;


public class RecyclerView_dAdapter extends RecyclerView.Adapter<RecyclerView_dAdapter.ViewHolder>{

    private List<List_Item> List_Item;
    private Context context;

    public RecyclerView_dAdapter(List<List_Item> list_Item, Context context) {
        List_Item = list_Item;
        this.context = context;
    }

    @Override
    public RecyclerView_dAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView_dAdapter.ViewHolder holder, final int position) {

        holder.TextName.setText(List_Item.get(position).getName());
        holder.imageView.setImageResource(List_Item.get(position).getImg());
        Picasso.with(context).load(List_Item.get(position).img).into(holder.imageView);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, List_Item.get(position).getName(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return (null != List_Item ? List_Item.size() : 0);
    }

    protected class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        private ImageView imageView;
        private TextView TextName;

        public ViewHolder(View view) {
            super(view);
            cardView = (CardView) view.findViewById(R.id.cardView);
            imageView = (ImageView) view.findViewById(R.id.imageView);
            TextName = (TextView) view.findViewById(R.id.TextName);
        }
    }
}

