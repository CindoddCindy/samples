package com.example.samplesrepos.view.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.samplesrepos.R;
import com.example.samplesrepos.model.IsiFrgamentSatu;
import com.example.samplesrepos.view.adapter.FragmentSatuAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentSatu#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentSatu extends Fragment {
    private List<IsiFrgamentSatu> isiFrgamentSatuList;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager_dua;
    private FragmentSatuAdapter fragmentSatuAdapter;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentSatu() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentSatu.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentSatu newInstance(String param1, String param2) {
        FragmentSatu fragment = new FragmentSatu();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_satu, container, false);

        recyclerView =view.findViewById(R.id.rv_ini);
       // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));

         LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());


        isiFrgamentSatuList = new ArrayList<>();
        isiFrgamentSatuList.add(new IsiFrgamentSatu("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F35%2F2019%2F04%2F16185045%2Forange-juice-healthy-drink.jpg","judul","kete"));
        isiFrgamentSatuList.add(new IsiFrgamentSatu("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F35%2F2019%2F04%2F16185044%2Flemonade-healthy-drinks.jpg","judul","kete"));
        isiFrgamentSatuList.add(new IsiFrgamentSatu("https://en.shafaqna.com/wp-content/uploads/2017/06/infused-water.jpg","judul","kete"));
        isiFrgamentSatuList.add(new IsiFrgamentSatu("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQWdBmswERco8Aj52uqvQB84O2EmL9y_4DgVphkQhuOrAxtfYmu&usqp=CAU","judul","kete"));
        isiFrgamentSatuList.add(new IsiFrgamentSatu("https://static.toiimg.com/photo/65798330.cms","judul","kete"));
        isiFrgamentSatuList.add(new IsiFrgamentSatu("https://www.sterling-wellness.com/wp-content/uploads/2015/10/healthy-tea.jpg","judul","kete"));
        isiFrgamentSatuList.add(new IsiFrgamentSatu("https://www.couponcodesme.com/blog/wp-content/uploads/48841123467_4a1b2c176b_b.jpg","judul","kete"));
        isiFrgamentSatuList.add(new IsiFrgamentSatu("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSF-ZAgh9HY4xHoOLu3qf4vK6jTCdvO9NLbFU7D2w_pNsdu42pU&usqp=CAU","judul","kete"));
        isiFrgamentSatuList.add(new IsiFrgamentSatu("https://i0.wp.com/www.themamaneedscake.com/wp-content/uploads/2019/01/DSC05558.jpg?fit=708%2C1000&ssl=1","judul","kete"));
        isiFrgamentSatuList.add(new IsiFrgamentSatu("https://asset.kompas.com/crops/zyb6sqzrS-pWbE80kuatYjjmWds=/0x0:1000x667/750x500/data/photo/2020/03/28/5e7eb044aa9a2.jpg","judul","kete"));
        isiFrgamentSatuList.add(new IsiFrgamentSatu("https://cdn-a.william-reed.com/var/wrbm_gb_food_pharma/storage/images/publications/food-beverage-nutrition/nutraingredients.com/news/research/mice-study-green-tea-shows-promise-for-food-allergies/10897991-1-eng-GB/Mice-study-Green-tea-shows-promise-for-food-allergies_wrbm_large.jpg","judul","kete"));

        fragmentSatuAdapter= new FragmentSatuAdapter(getActivity(),isiFrgamentSatuList);
        recyclerView.setAdapter(fragmentSatuAdapter);


        return view;
    }
}