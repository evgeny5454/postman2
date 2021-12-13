// Generated by view binder compiler. Do not edit!
package com.evgeny_m.postman.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import com.evgeny_m.postman.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentEnterPhoneNumberBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText phoneNumber;

  @NonNull
  public final EditText smsCode;

  @NonNull
  public final Toolbar toolbar;

  private FragmentEnterPhoneNumberBinding(@NonNull LinearLayout rootView,
      @NonNull EditText phoneNumber, @NonNull EditText smsCode, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.phoneNumber = phoneNumber;
    this.smsCode = smsCode;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentEnterPhoneNumberBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentEnterPhoneNumberBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_enter_phone_number, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentEnterPhoneNumberBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.phoneNumber;
      EditText phoneNumber = rootView.findViewById(id);
      if (phoneNumber == null) {
        break missingId;
      }

      id = R.id.smsCode;
      EditText smsCode = rootView.findViewById(id);
      if (smsCode == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      return new FragmentEnterPhoneNumberBinding((LinearLayout) rootView, phoneNumber, smsCode,
          toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
