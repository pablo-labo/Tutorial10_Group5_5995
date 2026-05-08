package com.facebook.react.modules.dialog;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.c;
import androidx.fragment.app.f;
import androidx.fragment.app.g;
import com.facebook.react.modules.dialog.DialogModule;
import com.indeed.android.jobsearch.R;
import defpackage.epg;
import defpackage.hh1;
import defpackage.wac;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/modules/dialog/b;", "Landroidx/fragment/app/f;", "Landroid/content/DialogInterface$OnClickListener;", "<init>", "()V", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"fragment_subclass_nonempty_constructor"})
public final class b extends f implements DialogInterface.OnClickListener {
    public final DialogModule.a f0;

    public static final class a {
        public static View a(g gVar, String str) {
            View viewInflate = LayoutInflater.from(gVar).inflate(R.layout.alert_title_layout, (ViewGroup) null);
            viewInflate.getClass();
            View viewFindViewById = viewInflate.findViewById(R.id.alert_title);
            hh1.n(viewFindViewById);
            TextView textView = (TextView) viewFindViewById;
            textView.setText(str);
            textView.setFocusable(true);
            if (Build.VERSION.SDK_INT >= 28) {
                textView.setAccessibilityHeading(true);
                return viewInflate;
            }
            epg.o(textView, new com.facebook.react.modules.dialog.a(textView));
            return viewInflate;
        }
    }

    @SuppressLint({"ValidFragment"})
    public b(DialogModule.a aVar, Bundle bundle) {
        this.f0 = aVar;
        setArguments(bundle);
    }

    @Override // androidx.fragment.app.f
    public final Dialog H(Bundle bundle) {
        g gVarRequireActivity = requireActivity();
        gVarRequireActivity.getClass();
        Bundle bundleRequireArguments = requireArguments();
        bundleRequireArguments.getClass();
        TypedArray typedArrayObtainStyledAttributes = gVarRequireActivity.obtainStyledAttributes(wac.j);
        typedArrayObtainStyledAttributes.getClass();
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(117);
        typedArrayObtainStyledAttributes.recycle();
        if (!zHasValue) {
            AlertDialog.Builder builder = new AlertDialog.Builder(gVarRequireActivity);
            if (bundleRequireArguments.containsKey("title")) {
                String string = bundleRequireArguments.getString("title");
                hh1.n(string);
                builder.setCustomTitle(a.a(gVarRequireActivity, string));
            }
            if (bundleRequireArguments.containsKey("button_positive")) {
                builder.setPositiveButton(bundleRequireArguments.getString("button_positive"), this);
            }
            if (bundleRequireArguments.containsKey("button_negative")) {
                builder.setNegativeButton(bundleRequireArguments.getString("button_negative"), this);
            }
            if (bundleRequireArguments.containsKey("button_neutral")) {
                builder.setNeutralButton(bundleRequireArguments.getString("button_neutral"), this);
            }
            if (bundleRequireArguments.containsKey("message")) {
                builder.setMessage(bundleRequireArguments.getString("message"));
            }
            if (bundleRequireArguments.containsKey("items")) {
                builder.setItems(bundleRequireArguments.getCharSequenceArray("items"), this);
            }
            AlertDialog alertDialogCreate = builder.create();
            alertDialogCreate.getClass();
            return alertDialogCreate;
        }
        c.a aVar = new c.a(gVarRequireActivity);
        boolean zContainsKey = bundleRequireArguments.containsKey("title");
        AlertController.b bVar = aVar.a;
        if (zContainsKey) {
            String string2 = bundleRequireArguments.getString("title");
            hh1.n(string2);
            bVar.e = a.a(gVarRequireActivity, string2);
        }
        if (bundleRequireArguments.containsKey("button_positive")) {
            aVar.a(bundleRequireArguments.getString("button_positive"), this);
        }
        if (bundleRequireArguments.containsKey("button_negative")) {
            bVar.i = bundleRequireArguments.getString("button_negative");
            bVar.j = this;
        }
        if (bundleRequireArguments.containsKey("button_neutral")) {
            bVar.k = bundleRequireArguments.getString("button_neutral");
            bVar.l = this;
        }
        if (bundleRequireArguments.containsKey("message")) {
            bVar.f = bundleRequireArguments.getString("message");
        }
        if (bundleRequireArguments.containsKey("items")) {
            bVar.p = bundleRequireArguments.getCharSequenceArray("items");
            bVar.r = this;
        }
        c cVarCreate = aVar.create();
        cVarCreate.getClass();
        return cVarCreate;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.getClass();
        DialogModule.a aVar = this.f0;
        if (aVar != null) {
            aVar.onClick(dialogInterface, i);
        }
    }

    @Override // androidx.fragment.app.f, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        DialogModule.a aVar = this.f0;
        if (aVar != null) {
            aVar.onDismiss(dialogInterface);
        }
    }

    public b() {
        this.f0 = null;
    }
}
