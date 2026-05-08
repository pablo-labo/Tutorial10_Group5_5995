package com.linecorp.linesdk.auth.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.indeed.android.jobsearch.R;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineAuthenticationParams;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.linecorp.linesdk.auth.internal.LineAuthenticationStatus;
import com.linecorp.linesdk.auth.internal.a;
import com.linecorp.linesdk.auth.internal.b.RunnableC0187b;
import com.linecorp.linesdk.internal.pkce.PKCECode;
import defpackage.ove;
import defpackage.xw8;

/* JADX INFO: loaded from: classes3.dex */
public class LineAuthenticationActivity extends Activity {
    public static final /* synthetic */ int d = 0;
    public boolean a = false;
    public LineAuthenticationStatus b;
    public b c;

    public final void a(LineLoginResult lineLoginResult) {
        LineAuthenticationStatus lineAuthenticationStatus = this.b;
        if (lineAuthenticationStatus == null) {
            finish();
            return;
        }
        LineAuthenticationStatus.b bVar = lineAuthenticationStatus.e;
        if ((bVar != LineAuthenticationStatus.b.b || this.a) && bVar != LineAuthenticationStatus.b.d) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("authentication_result", lineLoginResult);
        setResult(-1, intent);
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.b.e == LineAuthenticationStatus.b.b) {
            b bVar = this.c;
            if (i != 3) {
                bVar.getClass();
            } else {
                if (bVar.h.e == LineAuthenticationStatus.b.c) {
                    return;
                }
                new Handler(Looper.getMainLooper()).postDelayed(bVar.new RunnableC0187b(), 1000L);
            }
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        LineAuthenticationStatus lineAuthenticationStatus;
        super.onCreate(bundle);
        setContentView(R.layout.linesdk_activity_lineauthentication);
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (data != null && data.getScheme().equals("lineauth")) {
            b.i = intent;
            finish();
            return;
        }
        LineAuthenticationConfig lineAuthenticationConfig = (LineAuthenticationConfig) intent.getParcelableExtra("authentication_config");
        LineAuthenticationParams lineAuthenticationParams = (LineAuthenticationParams) intent.getParcelableExtra("authentication_params");
        if (lineAuthenticationConfig == null || lineAuthenticationParams == null) {
            a(LineLoginResult.a(xw8.f, new LineApiError("The requested parameter is illegal.")));
            return;
        }
        if (bundle == null || (lineAuthenticationStatus = (LineAuthenticationStatus) bundle.getParcelable("authentication_status")) == null) {
            lineAuthenticationStatus = new LineAuthenticationStatus();
        }
        this.b = lineAuthenticationStatus;
        this.c = new b(this, lineAuthenticationConfig, lineAuthenticationStatus, lineAuthenticationParams);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.b.e == LineAuthenticationStatus.b.b) {
            this.c.a(intent);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        LineAuthenticationStatus.b bVar = this.b.e;
        if (bVar == LineAuthenticationStatus.b.a) {
            b bVar2 = this.c;
            LineAuthenticationActivity lineAuthenticationActivity = bVar2.a;
            LineAuthenticationStatus lineAuthenticationStatus = bVar2.h;
            lineAuthenticationStatus.e = LineAuthenticationStatus.b.b;
            PKCECode pKCECode = new PKCECode(ove.a(64));
            lineAuthenticationStatus.a = pKCECode;
            try {
                a.b bVarA = bVar2.e.a(lineAuthenticationActivity, bVar2.b, pKCECode, bVar2.g);
                Bundle bundle = bVarA.b;
                Intent intent = bVarA.a;
                if (bVarA.d) {
                    lineAuthenticationActivity.startActivity(intent, bundle);
                } else {
                    lineAuthenticationActivity.startActivityForResult(intent, 3, bundle);
                }
                lineAuthenticationStatus.b = bVarA.c;
            } catch (ActivityNotFoundException e) {
                lineAuthenticationStatus.e = LineAuthenticationStatus.b.d;
                lineAuthenticationActivity.a(LineLoginResult.a(xw8.f, new LineApiError(e, LineApiError.b.a)));
            }
        } else if (bVar != LineAuthenticationStatus.b.c) {
            b bVar3 = this.c;
            bVar3.getClass();
            new Handler(Looper.getMainLooper()).postDelayed(bVar3.new RunnableC0187b(), 1000L);
        }
        this.a = false;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("authentication_status", this.b);
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        this.a = true;
    }
}
