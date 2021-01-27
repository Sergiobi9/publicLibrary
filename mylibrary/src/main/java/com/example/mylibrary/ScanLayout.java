package com.example.mylibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;

public class ScanLayout extends RelativeLayout {

    private Context mContext;
    private AttributeSet attrs;
    private int styleAttr;
    private View view;

    /** Core Components*/
    ImageView image;
    View alphaLayer;

    /** Attributes **/
    Drawable imageFile;
    Drawable imagePlaceHolder;
    Drawable imageError;
    Drawable gradient;

    public ScanLayout(Context context) {
        super(context);
        this.mContext=context;
        initView();
    }

    public ScanLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext=context;
        this.attrs=attrs;
        initView();
    }

    public ScanLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;
        this.attrs=attrs;
        this.styleAttr=defStyleAttr;
        initView();
    }

    private void initView() {
        this.view=this;
        inflate(mContext, R.layout.fragment_scan,this);

        TypedArray arr = mContext.obtainStyledAttributes(attrs,R.styleable.GradientArtistBasic,
                styleAttr,0);

        imageFile=arr.getDrawable(R.styleable.GradientArtistBasic_imageSrc);
        imageError=arr.getDrawable(R.styleable.GradientArtistBasic_imageError);
        imagePlaceHolder=arr.getDrawable(R.styleable.GradientArtistBasic_imagePlaceholder);
        gradient=arr.getDrawable(R.styleable.GradientArtistBasic_gradient);

        image = (ImageView) findViewById(R.id.background_image);

        arr.recycle();
    }

    public void setScaleType(ImageView.ScaleType scaleType){
        image.setScaleType(scaleType);
    }

    public void setGradient(Drawable gradient){
        alphaLayer.setBackground(gradient);
    }

    public void setDrawableImage(Drawable imageFile){
        image.setImageDrawable(imageFile);
    }

    public void setDrawableImage(int imageFile, int imageError, int imagePlaceHolder,
                                 ImageView.ScaleType scaleType) {

        image.setScaleType(scaleType);
        Glide
                .with(mContext)
                .load(imageFile)
                .placeholder(imagePlaceHolder)
                .error(imageError)
                .into(image);

    }

    public void setUrlImage(String url,
                            ImageView.ScaleType scaleType) {
        image.setScaleType(scaleType);
        Glide
                .with(mContext)
                .load(url)
                .dontAnimate()
                .into(image);

        setFinallyUrl();
    }

    private void setFinallyUrl(){
        System.out.println("Hello");
        ToastMessage toastMessage = new ToastMessage();
        toastMessage.showToast(getContext());
    }

    public void setResImage(int resID,ImageView.ScaleType scaleType) {
        image.setScaleType(scaleType);
        image.setImageResource(resID);
    }

}