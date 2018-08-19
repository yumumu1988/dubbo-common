package model;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class CourseWare implements Serializable {
    private static final long serialVersionUID = 4350832985654519617L;

    private Integer id;
    private String title;
    private JSON slideSequence;
}
