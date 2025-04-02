package org.primefaces.test;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Data;

@Data
@Named("myBean")
@ViewScoped
public class TestView implements Serializable {

    @Getter
    @Setter
    private List<parentDtoV1> parents;

    @Getter
    @Setter
    private ParentDtoV1 selectedParent;

    @Getter
    @Setter
    private FragmentDtoV1 selectedFragment;

    public void rowSelect(SelectEvent<Object> event) {
        if (event.getObject() instanceof ParentDtoV1 parent) {
            selectedFragment = null;
        } else if (event.getObject() instanceof FragmentDtoV1 fragment) {
            selectedParent = null;
        } else {
            selectedFragment = null;
            selectedParent = null;
        }
    }
}
