package com.uama.happinesscommunity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uama.happinesscommunity.life.R;

import butterknife.ButterKnife;

/**
 * Created by Jin
 */
public class LifeFragment extends BaseFragment {

//    @BindView(R2.id.recyclerView)
//    RecyclerView recyclerView;
//    @BindView(R2.id.wei_dian)
//    ImageView weiDian;
//    @BindView(R2.id.wei_dian_layout)
//    LinearLayout weiDianlayout;

    View rootView;
//    private LifeIndexPreAdapter mAdapter;

    private static final String ARG_PARAM1 = "param";

    public static LifeFragment newInstance(String param1) {
        LifeFragment fragment = new LifeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.life_layout, container, false);
            ButterKnife.bind(this, rootView);
//            StyleUtil.title(rootView, "生活");

//            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//            int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.margin_size_smallest);
//            recyclerView.addItemDecoration(new SpaceItemBottomDecoration(spacingInPixels));
//            mAdapter = new LifeIndexPreAdapter(mContext, null);
//            recyclerView.setAdapter(mAdapter);
//
//            weiDian.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    //进入微店
//                    qStartActivity(MicroShopListActivity.class);
//                }
//            });
//
//            loadData();
        }

        return rootView;
    }

//    private List<LifeIndexResp.DataBean> list1, list2;
//
//    public void loadData() {
//        list1 = new ArrayList<>();
//        list2 = new ArrayList<>();
//
//        LifeApiClient.lifeIndex(getActivity(), new Callback<LifeIndexResp>() {
//            @Override
//            public void onResponse(Call<LifeIndexResp> call, Response<LifeIndexResp> response) {
//                try {
//                    if (null != response.body())
//                        if (response.body().getStatus().equalsIgnoreCase(ApiClient.SUCCESS)) {
//
//                            List<LifeIndexResp.DataBean> list = response.body().getData();
//
//                            for (LifeIndexResp.DataBean bean : list) {
//                                if (bean.getType() == 1) {
//                                    list1.add(bean);
//                                } else if (bean.getType() == 2) {
//                                    list2.add(bean);
//                                }
//                            }
//
//                            mAdapter.setNewData(list1);
//                            weiDianlayout.setVisibility(list2.size() == 0 ? View.GONE : View.VISIBLE);
//                        } else {
//                            ToastUtil.showLong(mContext, response.body().getMsg());
//                        }
//                } catch (Exception e) {}
//            }
//
//            @Override
//            public void onFailure(Call<LifeIndexResp> call, Throwable t) {
//                t.printStackTrace();
//            }
//        });
//
//    }
//
//    @Override
//    public void onDestroyView() {
//        super.onDestroyView();
//        ((ViewGroup) rootView.getParent()).removeView(rootView);
//        ButterKnife.unbind(this);
//    }
}