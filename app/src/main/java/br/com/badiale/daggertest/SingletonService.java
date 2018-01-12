package br.com.badiale.daggertest;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class SingletonService {
    @Inject
    SingletonService() {
    }
}
