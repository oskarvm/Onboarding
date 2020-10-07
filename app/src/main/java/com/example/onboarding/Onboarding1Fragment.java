package com.example.onboarding;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import com.example.onboarding.databinding.FragmentOnboarding1Binding;

public class Onboarding1Fragment extends Fragment {

    private FragmentOnboarding1Binding binding;
    NavController navController;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOnboarding1Binding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ///// navegar a la otra pantalla
                navController.navigate(R.id.action_onboarding1Fragment_to_onboarding2Fragment);
            }
        });

        binding.button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ///// navegar a la otra pantalla
                navController.navigate(R.id.action_onboarding1Fragment_to_homeFragment);
            }
        });
    }

}