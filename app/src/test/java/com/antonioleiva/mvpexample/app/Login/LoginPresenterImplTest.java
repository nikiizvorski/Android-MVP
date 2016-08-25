package com.antonioleiva.mvpexample.app.Login;


import android.view.View;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by NIKI on 7/31/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterImplTest {

    @Mock
    private LoginView view;
    @Mock
    private LoginPresenterImpl presenter;
    @Mock
    private LoginInteractorImpl service;
    private LoginInteractor.OnLoginFinishedListener listener;

    @Before
    public void setUp() throws Exception {
            presenter = new LoginPresenterImpl(view);
        service = new LoginInteractorImpl();
    }

    @Test
    public void testValidateCredentials() throws Exception {
        final String user = null;
        final String pass = null;
    }

    @Test
    public void testOnUsernameError() throws Exception {

    }

    @Test
    public void testOnPasswordError() throws Exception {

    }

    @Test
    public void testOnSuccess() throws Exception {

    }
}