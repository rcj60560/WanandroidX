package com.luocj.wanandroidx.model;

import android.text.TextUtils;
import android.view.TextureView;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class LoginViewModel extends ViewModel {

    private MutableLiveData<String> account;
    private MutableLiveData<String> psd;

    public MutableLiveData<String> getAccount() {
        if (TextUtils.isEmpty((CharSequence) account)) {
            account = new MutableLiveData<>();
            account.setValue("");
        }
        return account;
    }

    public void setAccount(MutableLiveData<String> account) {
        this.account = account;
    }

    public MutableLiveData<String> getPsd() {
        if (TextUtils.isEmpty((CharSequence) psd)) {
            psd = new MutableLiveData<>();
            psd.setValue("");
        }
        return psd;
    }

    public void setPsd(MutableLiveData<String> psd) {
        this.psd = psd;
    }


}
