package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import defpackage.cr5;
import defpackage.cs5;
import defpackage.l5;
import defpackage.r6;
import defpackage.rac;

/* JADX INFO: loaded from: classes.dex */
public final class j implements LayoutInflater.Factory2 {
    public final FragmentManager a;

    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ m a;

        public a(m mVar) {
            this.a = mVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            m mVar = this.a;
            Fragment fragment = mVar.c;
            mVar.k();
            r.f((ViewGroup) fragment.mView.getParent(), j.this.a).e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public j(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        m mVarF;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        FragmentManager fragmentManager = this.a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, fragmentManager);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rac.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = Fragment.class.isAssignableFrom(i.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment fragmentC = resourceId != -1 ? fragmentManager.C(resourceId) : null;
                    if (fragmentC == null && string != null) {
                        fragmentC = fragmentManager.D(string);
                    }
                    if (fragmentC == null && id != -1) {
                        fragmentC = fragmentManager.C(id);
                    }
                    if (fragmentC == null) {
                        i iVarH = fragmentManager.H();
                        context.getClassLoader();
                        fragmentC = iVarH.a(attributeValue);
                        fragmentC.mFromLayout = true;
                        fragmentC.mFragmentId = resourceId != 0 ? resourceId : id;
                        fragmentC.mContainerId = id;
                        fragmentC.mTag = string;
                        fragmentC.mInLayout = true;
                        fragmentC.mFragmentManager = fragmentManager;
                        cr5<?> cr5Var = fragmentManager.v;
                        fragmentC.mHost = cr5Var;
                        fragmentC.onInflate((Context) cr5Var.b, attributeSet, fragmentC.mSavedFragmentState);
                        mVarF = fragmentManager.a(fragmentC);
                        if (FragmentManager.K(2)) {
                            Log.v("FragmentManager", "Fragment " + fragmentC + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (fragmentC.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        fragmentC.mInLayout = true;
                        fragmentC.mFragmentManager = fragmentManager;
                        cr5<?> cr5Var2 = fragmentManager.v;
                        fragmentC.mHost = cr5Var2;
                        fragmentC.onInflate((Context) cr5Var2.b, attributeSet, fragmentC.mSavedFragmentState);
                        mVarF = fragmentManager.f(fragmentC);
                        if (FragmentManager.K(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + fragmentC + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    cs5.a aVar = cs5.a;
                    cs5.b(new FragmentTagUsageViolation(fragmentC, viewGroup));
                    cs5.a(fragmentC).getClass();
                    fragmentC.mContainer = viewGroup;
                    mVarF.k();
                    mVarF.j();
                    View view2 = fragmentC.mView;
                    if (view2 == null) {
                        r6.g(l5.m("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragmentC.mView.getTag() == null) {
                        fragmentC.mView.setTag(string);
                    }
                    fragmentC.mView.addOnAttachStateChangeListener(new a(mVarF));
                    return fragmentC.mView;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
