package com.yhz.yhz.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;

import com.yhz.yhz.R;
import com.yhz.yhz.interfaces.HeadCallBack;

/**
 * @description: HeadView (公共头部控件)
 * @author: Y.hz
 * @time: 2019/12/20 14:50
 */
public class HeadView extends FrameLayout implements View.OnClickListener {

    private Context mContext;
    private View view;
    private RelativeLayout headRlRight;
    private LinearLayout headLl;
    private ImageView headImgLeft, headImgRight;
    private TextView headTvTitle, headTvRight;
    private HeadCallBack headCallBack;

    public HeadView(Context context) {
        super(context);
        initView(context);
    }

    public HeadView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public HeadView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        mContext = context;
        view = LayoutInflater.from(mContext).inflate(R.layout.layout_head, this);
        headLl = view.findViewById(R.id.head_ll);
        headImgLeft = view.findViewById(R.id.head_img_left);
        headImgRight = view.findViewById(R.id.head_img_right);
        headTvTitle = view.findViewById(R.id.head_tv_title);
        headTvRight = view.findViewById(R.id.head_tv_right);
        headRlRight = view.findViewById(R.id.head_rl_right);
    }

    public void setData(@ColorRes int colorId, String titleText, boolean leftVisibiliy,
                        @DrawableRes int leftImgId, boolean rightImgVisibiliy,
                        @DrawableRes int rightImgId, boolean rightTvVisibiliy,
                        @StringRes int rightTvId, HeadCallBack headCallBack) {
        this.headCallBack = headCallBack;
        if (colorId!=0){
            headLl.setBackgroundColor(getResources().getColor(colorId));
        }

        if (leftVisibiliy) {
            headImgLeft.setVisibility(View.VISIBLE);
        } else {
            headImgLeft.setVisibility(View.INVISIBLE);
        }
        if (leftImgId!=0){
            headImgLeft.setImageResource(leftImgId);
        }
        headImgLeft.setOnClickListener(this);

        if (rightImgVisibiliy) {
            headImgRight.setVisibility(View.VISIBLE);
        } else {
            headImgRight.setVisibility(View.INVISIBLE);
        }
        if (rightImgId!=0){
            headImgRight.setImageResource(rightImgId);
        }
        if (rightTvVisibiliy){
            headTvRight.setVisibility(View.VISIBLE);
        }else {
            headTvRight.setVisibility(View.INVISIBLE);
        }
        if (rightTvId!=0){
            headTvRight.setText(rightTvId);
        }

        headRlRight.setOnClickListener(this);

        headTvTitle.setText(titleText);
    }

    public void setData(int height, @DimenRes int dimenId, @ColorRes int colorId, String titleText, boolean leftVisibiliy,
                        @DrawableRes int leftImgId, boolean rightImgVisibiliy,
                        @DrawableRes int rightImgId, boolean rightTvVisibiliy,
                        @StringRes int rightTvId, HeadCallBack headCallBack) {
        this.headCallBack = headCallBack;
        if (colorId!=0){
            headLl.setBackgroundColor(getResources().getColor(colorId));
        }

        if (leftVisibiliy) {
            headImgLeft.setVisibility(View.VISIBLE);
        } else {
            headImgLeft.setVisibility(View.INVISIBLE);
        }
        if (leftImgId!=0){
            headImgLeft.setImageResource(leftImgId);
        }
        headImgLeft.setOnClickListener(this);

        if (rightImgVisibiliy) {
            headImgRight.setVisibility(View.VISIBLE);
        } else {
            headImgRight.setVisibility(View.INVISIBLE);
        }
        if (rightImgId!=0){
            headImgRight.setImageResource(rightImgId);
        }
        if (rightTvVisibiliy){
            headTvRight.setVisibility(View.VISIBLE);
        }else {
            headTvRight.setVisibility(View.INVISIBLE);
        }
        if (rightTvId!=0){
            headTvRight.setText(rightTvId);
        }

        headRlRight.setOnClickListener(this);
        if (height!=0){
            FrameLayout.LayoutParams layoutParams = (LayoutParams) headLl.getLayoutParams();
            layoutParams.height = height;
            headLl.setLayoutParams(layoutParams);
        }
        if (dimenId!=0){
            headTvTitle.setTextSize(getResources().getDimension(dimenId));
        }

        headTvTitle.setText(titleText);
    }

    public void setDataImg(@DrawableRes int drawableId, String titleText, boolean leftVisibiliy,
                           @DrawableRes int leftImgId, boolean rightImgVisibiliy,
                           @DrawableRes int rightImgId, boolean rightTvVisibiliy,
                           @StringRes int rightTvId, HeadCallBack headCallBack) {
        this.headCallBack = headCallBack;
        if (drawableId!=0){
            headLl.setBackground(getResources().getDrawable(drawableId));
        }
        if (leftVisibiliy) {
            headImgLeft.setVisibility(View.VISIBLE);
        } else {
            headImgLeft.setVisibility(View.INVISIBLE);
        }
        if (leftImgId!=0){
            headImgLeft.setImageResource(leftImgId);
        }
        headImgLeft.setOnClickListener(this);

        if (rightImgVisibiliy) {
            headImgRight.setVisibility(View.VISIBLE);
        } else {
            headImgRight.setVisibility(View.INVISIBLE);
        }
        if (rightImgId!=0){
            headImgRight.setImageResource(rightImgId);
        }
        if (rightTvVisibiliy){
            headTvRight.setVisibility(View.VISIBLE);
        }else {
            headTvRight.setVisibility(View.INVISIBLE);
        }
        if (rightTvId!=0){
            headTvRight.setText(rightTvId);
        }

        headRlRight.setOnClickListener(this);

        headTvTitle.setText(titleText);
    }

    public void setDataImg(int height, @DimenRes int dimenId,@DrawableRes int drawableId, String titleText, boolean leftVisibiliy,
                        @DrawableRes int leftImgId, boolean rightImgVisibiliy,
                        @DrawableRes int rightImgId, boolean rightTvVisibiliy,
                        @StringRes int rightTvId, HeadCallBack headCallBack) {
        this.headCallBack = headCallBack;
        if (drawableId!=0){
            headLl.setBackground(getResources().getDrawable(drawableId));
        }
        if (leftVisibiliy) {
            headImgLeft.setVisibility(View.VISIBLE);
        } else {
            headImgLeft.setVisibility(View.INVISIBLE);
        }
        if (leftImgId!=0){
            headImgLeft.setImageResource(leftImgId);
        }
        headImgLeft.setOnClickListener(this);

        if (rightImgVisibiliy) {
            headImgRight.setVisibility(View.VISIBLE);
        } else {
            headImgRight.setVisibility(View.INVISIBLE);
        }
        if (rightImgId!=0){
            headImgRight.setImageResource(rightImgId);
        }
        if (rightTvVisibiliy){
            headTvRight.setVisibility(View.VISIBLE);
        }else {
            headTvRight.setVisibility(View.INVISIBLE);
        }
        if (rightTvId!=0){
            headTvRight.setText(rightTvId);
        }

        headRlRight.setOnClickListener(this);
        if (height!=0){
            FrameLayout.LayoutParams layoutParams = (LayoutParams) headLl.getLayoutParams();
            layoutParams.height = height;
            headLl.setLayoutParams(layoutParams);
        }
        if (dimenId!=0){
            headTvTitle.setTextSize(getResources().getDimension(dimenId));
        }
        headTvTitle.setText(titleText);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.head_img_left) {
            headCallBack.onLeftClickLastListener();
        }else if (v.getId() == R.id.head_rl_right){
            headCallBack.onRightClickLastListener();
        }
    }
}
