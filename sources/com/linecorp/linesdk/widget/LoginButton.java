package com.linecorp.linesdk.widget;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.indeed.android.jobsearch.R;
import com.linecorp.linesdk.LoginDelegate;
import com.linecorp.linesdk.LoginListener;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineAuthenticationParams;
import com.linecorp.linesdk.auth.internal.LineAuthenticationActivity;
import com.linecorp.linesdk.internal.FragmentWrapper;
import com.linecorp.linesdk.internal.LoginHandler;
import defpackage.b0;
import defpackage.ft4;
import defpackage.s49;
import defpackage.tpd;
import java.util.Arrays;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public class LoginButton extends AppCompatTextView {
    private LineAuthenticationParams authenticationParams;
    private String channelId;
    private FragmentWrapper fragmentWrapper;
    private View.OnClickListener internalListener;
    private boolean isLineAppAuthEnabled;
    private LoginDelegate loginDelegate;
    private LoginHandler loginHandler;

    public LoginButton(Context context) {
        super(context);
        this.isLineAppAuthEnabled = true;
        LineAuthenticationParams.c cVar = new LineAuthenticationParams.c();
        cVar.a = Arrays.asList(tpd.c);
        this.authenticationParams = new LineAuthenticationParams(cVar);
        this.loginHandler = new LoginHandler();
        this.internalListener = new View.OnClickListener() { // from class: r49
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                this.a.lambda$new$0(view);
            }
        };
        init();
    }

    private Activity getActivity() {
        Context context = getContext();
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        b0.o("Cannot find an Activity");
        return null;
    }

    private void init() {
        setAllCaps(false);
        setGravity(17);
        setText(R.string.btn_line_login);
        setTextColor(getContext().getColor(R.color.text_login_btn));
        setBackgroundResource(R.drawable.background_login_btn);
        super.setOnClickListener(this.internalListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) throws Exception {
        String str = this.channelId;
        if (str == null) {
            b0.o("Channel id should be set.");
            return;
        }
        if (str.isEmpty()) {
            b0.o("Channel id should not be empty.");
            return;
        }
        FragmentWrapper fragmentWrapper = this.fragmentWrapper;
        String str2 = this.channelId;
        if (fragmentWrapper != null) {
            performLoginWithFragment(str2, fragmentWrapper);
        } else {
            performLoginWithActivity(str2, getActivity());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnClickListener$1(View.OnClickListener onClickListener, View view) {
        this.internalListener.onClick(view);
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    private void performLoginWithActivity(String str, Activity activity) {
        Intent intent;
        LoginHandler loginHandler = this.loginHandler;
        boolean z = this.isLineAppAuthEnabled;
        LineAuthenticationParams lineAuthenticationParams = this.authenticationParams;
        loginHandler.getClass();
        if (z) {
            LineAuthenticationConfig lineAuthenticationConfig = new LineAuthenticationConfig(new LineAuthenticationConfig.b(str, activity));
            if (!ft4.b) {
                ft4.b = true;
                Executors.newSingleThreadExecutor().execute(new ft4.a(activity.getApplicationContext()));
            }
            int i = LineAuthenticationActivity.d;
            intent = new Intent(activity, (Class<?>) LineAuthenticationActivity.class);
            intent.putExtra("authentication_config", lineAuthenticationConfig);
            intent.putExtra("authentication_params", lineAuthenticationParams);
        } else {
            LineAuthenticationConfig.b bVar = new LineAuthenticationConfig.b(str, activity);
            bVar.e = true;
            LineAuthenticationConfig lineAuthenticationConfig2 = new LineAuthenticationConfig(bVar);
            if (!ft4.b) {
                ft4.b = true;
                Executors.newSingleThreadExecutor().execute(new ft4.a(activity.getApplicationContext()));
            }
            int i2 = LineAuthenticationActivity.d;
            intent = new Intent(activity, (Class<?>) LineAuthenticationActivity.class);
            intent.putExtra("authentication_config", lineAuthenticationConfig2);
            intent.putExtra("authentication_params", lineAuthenticationParams);
        }
        activity.startActivityForResult(intent, 1);
    }

    private void performLoginWithFragment(String str, FragmentWrapper fragmentWrapper) throws Exception {
        Intent intent;
        LoginHandler loginHandler = this.loginHandler;
        Activity activity = getActivity();
        boolean z = this.isLineAppAuthEnabled;
        LineAuthenticationParams lineAuthenticationParams = this.authenticationParams;
        loginHandler.getClass();
        if (z) {
            LineAuthenticationConfig lineAuthenticationConfig = new LineAuthenticationConfig(new LineAuthenticationConfig.b(str, activity));
            if (!ft4.b) {
                ft4.b = true;
                Executors.newSingleThreadExecutor().execute(new ft4.a(activity.getApplicationContext()));
            }
            int i = LineAuthenticationActivity.d;
            intent = new Intent(activity, (Class<?>) LineAuthenticationActivity.class);
            intent.putExtra("authentication_config", lineAuthenticationConfig);
            intent.putExtra("authentication_params", lineAuthenticationParams);
        } else {
            LineAuthenticationConfig.b bVar = new LineAuthenticationConfig.b(str, activity);
            bVar.e = true;
            LineAuthenticationConfig lineAuthenticationConfig2 = new LineAuthenticationConfig(bVar);
            if (!ft4.b) {
                ft4.b = true;
                Executors.newSingleThreadExecutor().execute(new ft4.a(activity.getApplicationContext()));
            }
            int i2 = LineAuthenticationActivity.d;
            intent = new Intent(activity, (Class<?>) LineAuthenticationActivity.class);
            intent.putExtra("authentication_config", lineAuthenticationConfig2);
            intent.putExtra("authentication_params", lineAuthenticationParams);
        }
        Fragment fragment = fragmentWrapper.a;
        if (fragment != null) {
            fragment.startActivityForResult(intent, 1);
            return;
        }
        androidx.fragment.app.Fragment fragment2 = fragmentWrapper.b;
        if (fragment2 != null) {
            fragment2.startActivityForResult(intent, 1);
        }
    }

    public void addLoginListener(LoginListener loginListener) {
        if (this.loginDelegate != null) {
            this.loginHandler.a.add(loginListener);
        } else {
            b0.o("You must set LoginDelegate through setLoginDelegate()  first");
        }
    }

    public void enableLineAppAuthentication(boolean z) {
        this.isLineAppAuthEnabled = z;
    }

    public void removeLoginListener(LoginListener loginListener) {
        this.loginHandler.a.remove(loginListener);
    }

    public void setAuthenticationParams(LineAuthenticationParams lineAuthenticationParams) {
        this.authenticationParams = lineAuthenticationParams;
    }

    public void setChannelId(String str) {
        this.channelId = str;
    }

    public void setFragment(Fragment fragment) {
        FragmentWrapper fragmentWrapper = new FragmentWrapper();
        fragmentWrapper.a = fragment;
        this.fragmentWrapper = fragmentWrapper;
    }

    public void setLoginDelegate(LoginDelegate loginDelegate) {
        if (loginDelegate instanceof s49) {
            this.loginDelegate = loginDelegate;
        } else {
            b0.o("Unexpected LoginDelegate, please use the provided Factory to create the instance");
        }
    }

    @Override // android.view.View
    public void setOnClickListener(final View.OnClickListener onClickListener) {
        super.setOnClickListener(new View.OnClickListener() { // from class: q49
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.lambda$setOnClickListener$1(onClickListener, view);
            }
        });
    }

    public void setFragment(androidx.fragment.app.Fragment fragment) {
        FragmentWrapper fragmentWrapper = new FragmentWrapper();
        fragmentWrapper.b = fragment;
        this.fragmentWrapper = fragmentWrapper;
    }

    public LoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isLineAppAuthEnabled = true;
        LineAuthenticationParams.c cVar = new LineAuthenticationParams.c();
        cVar.a = Arrays.asList(tpd.c);
        this.authenticationParams = new LineAuthenticationParams(cVar);
        this.loginHandler = new LoginHandler();
        this.internalListener = new View.OnClickListener() { // from class: r49
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                this.a.lambda$new$0(view);
            }
        };
        init();
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isLineAppAuthEnabled = true;
        LineAuthenticationParams.c cVar = new LineAuthenticationParams.c();
        cVar.a = Arrays.asList(tpd.c);
        this.authenticationParams = new LineAuthenticationParams(cVar);
        this.loginHandler = new LoginHandler();
        this.internalListener = new View.OnClickListener() { // from class: r49
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                this.a.lambda$new$0(view);
            }
        };
        init();
    }
}
